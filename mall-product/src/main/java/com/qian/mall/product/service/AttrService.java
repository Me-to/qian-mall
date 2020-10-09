package com.qian.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qian.common.utils.PageUtils;
import com.qian.mall.product.entity.AttrEntity;
import com.qian.mall.product.vo.AttrVo;

import java.util.Map;

/**
 * 商品属性
 *
 * @author zhangqian
 * @email 694656210@qq.com
 * @date 2020-09-19 00:38:34
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(AttrVo attr);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId);

}

