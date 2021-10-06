package com.codeman.gmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.order.entity.OrderSetting;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 11:18:12
 */
public interface OrderSettingService extends IService<OrderSetting> {

    PageUtils queryPage(Map<String, Object> params);
}

