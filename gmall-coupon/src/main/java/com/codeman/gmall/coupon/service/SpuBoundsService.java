package com.codeman.gmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.coupon.entity.SpuBounds;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:37:34
 */
public interface SpuBoundsService extends IService<SpuBounds> {

    PageUtils queryPage(Map<String, Object> params);
}

