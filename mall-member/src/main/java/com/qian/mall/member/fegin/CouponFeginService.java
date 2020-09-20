package com.qian.mall.member.fegin;

import com.qian.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mall-coupon")
public interface CouponFeginService {

    @RequestMapping("coupon/coupon/member/list")
    public R membercoupons();
}
