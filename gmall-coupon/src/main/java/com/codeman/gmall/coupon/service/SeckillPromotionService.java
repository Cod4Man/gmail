package com.codeman.gmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.coupon.entity.SeckillPromotion;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:37:32
 */
public interface SeckillPromotionService extends IService<SeckillPromotion> {

    PageUtils queryPage(Map<String, Object> params);
}

