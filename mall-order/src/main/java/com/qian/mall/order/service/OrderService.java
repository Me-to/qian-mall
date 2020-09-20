package com.qian.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qian.common.utils.PageUtils;
import com.qian.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author zhangqian
 * @email 694656210@qq.com
 * @date 2020-09-19 14:01:22
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

