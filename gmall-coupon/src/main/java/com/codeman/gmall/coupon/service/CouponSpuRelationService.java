package com.codeman.gmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.coupon.entity.CouponSpuRelation;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:37:32
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelation> {

    PageUtils queryPage(Map<String, Object> params);
}

