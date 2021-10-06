package com.codeman.gmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.coupon.entity.SkuLadder;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:37:33
 */
public interface SkuLadderService extends IService<SkuLadder> {

    PageUtils queryPage(Map<String, Object> params);
}

