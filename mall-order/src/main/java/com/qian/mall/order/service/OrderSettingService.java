package com.qian.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qian.common.utils.PageUtils;
import com.qian.mall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author zhangqian
 * @email 694656210@qq.com
 * @date 2020-09-19 14:01:22
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

