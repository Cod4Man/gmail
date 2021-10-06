package com.codeman.gmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.coupon.entity.CouponSpuCategoryRelation;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:37:31
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelation> {

    PageUtils queryPage(Map<String, Object> params);
}

