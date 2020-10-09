package com.qian.mall.product.service.impl;

import com.qian.mall.product.service.CategoryBrandRelationService;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qian.common.utils.PageUtils;
import com.qian.common.utils.Query;

import com.qian.mall.product.dao.CategoryDao;
import com.qian.mall.product.entity.CategoryEntity;
import com.qian.mall.product.service.CategoryService;

import javax.annotation.Resource;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Resource
    CategoryBrandRelationService categoryBrandRelationService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //查出所有信息
        List<CategoryEntity> entities = baseMapper.selectList(null);
        //找到所有一级分类
//        List<CategoryEntity> list1 = list.stream().filter((categoryEntity -> {
//            return categoryEntity.getParentCid() == 0;
//        })).collect(Collectors.toList());

        // 2. 组装成树形结构
        List<CategoryEntity> levelMenu = entities.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .map(menu -> {
                    menu.setChildren(getChildrens(menu, entities));
                    return menu;
                }).sorted((m1, m2) -> m1.getSort() == null ? 0 : m1.getSort() - (m2.getSort() == null ? 0 : m2.getSort())).collect(Collectors.toList());
        return levelMenu;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {

        baseMapper.deleteBatchIds(asList);
    }

    @Override
    public Long[] findCatelogPath(Long catelogId) {

        List<Long> paths=new ArrayList<>();
        List<Long> parentPath = findParentPath(catelogId, paths);
        Collections.reverse(parentPath);
        return parentPath.toArray(new Long[parentPath.size()]);
    }

    /**
     * 级联更新
     * @param category
     */
    @Override
    public void updateCascade(CategoryEntity category) {
this.updateById(category);
categoryBrandRelationService.updateCategory(category.getCatId(),category.getName());
    }

    private List<Long> findParentPath(Long catelogId,List<Long> paths){
        //收集当前节点
        paths.add(catelogId);
        CategoryEntity byId=this.getById(catelogId);
        if (byId.getParentCid()!=0){
            findParentPath(byId.getParentCid(),paths);
        }
        return paths;
}

    //递归查找
    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> children = all.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == root.getCatId())
                .map(categoryEntity -> {
                    categoryEntity.setChildren(getChildrens(categoryEntity, all));
                    return categoryEntity;
                })
                .sorted((m1, m2) -> m1.getSort() == null ? 0 : m1.getSort() - (m2.getSort() == null ? 0 : m2.getSort()))
                .collect(Collectors.toList());
        return children;
    }

}