package com.qian.mall.coupon.dao;

import com.qian.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhangqian
 * @email 694656210@qq.com
 * @date 2020-09-19 13:55:18
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
