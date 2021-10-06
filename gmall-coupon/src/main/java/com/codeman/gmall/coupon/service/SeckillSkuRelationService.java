package com.codeman.gmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.coupon.entity.SeckillSkuRelation;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:37:33
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelation> {

    PageUtils queryPage(Map<String, Object> params);
}

