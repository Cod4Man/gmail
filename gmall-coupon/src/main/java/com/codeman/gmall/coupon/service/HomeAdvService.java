package com.codeman.gmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.coupon.entity.HomeAdv;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:37:32
 */
public interface HomeAdvService extends IService<HomeAdv> {

    PageUtils queryPage(Map<String, Object> params);
}

