package com.qian.mall.order.dao;

import com.qian.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhangqian
 * @email 694656210@qq.com
 * @date 2020-09-19 14:01:22
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
