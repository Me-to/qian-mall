package com.qian.mall.product.dao;

import com.qian.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhangqian
 * @email 694656210@qq.com
 * @date 2020-09-19 00:38:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
