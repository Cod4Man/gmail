package com.codeman.gmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.coupon.entity.SeckillSkuNotice;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:37:33
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNotice> {

    PageUtils queryPage(Map<String, Object> params);
}

