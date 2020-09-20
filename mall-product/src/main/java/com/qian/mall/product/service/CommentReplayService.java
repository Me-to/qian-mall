package com.qian.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qian.common.utils.PageUtils;
import com.qian.mall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author zhangqian
 * @email 694656210@qq.com
 * @date 2020-09-19 00:38:34
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

