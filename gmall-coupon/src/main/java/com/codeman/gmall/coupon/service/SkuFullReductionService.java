package com.codeman.gmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.coupon.entity.SkuFullReduction;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:37:33
 */
public interface SkuFullReductionService extends IService<SkuFullReduction> {

    PageUtils queryPage(Map<String, Object> params);
}

