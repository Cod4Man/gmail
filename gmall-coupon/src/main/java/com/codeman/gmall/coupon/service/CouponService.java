package com.codeman.gmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.coupon.entity.Coupon;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:37:31
 */
public interface CouponService extends IService<Coupon> {

    PageUtils queryPage(Map<String, Object> params);
}

