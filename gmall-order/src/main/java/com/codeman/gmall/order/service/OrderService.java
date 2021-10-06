package com.codeman.gmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.order.entity.Order;

import java.util.Map;

/**
 * 订单
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 11:18:10
 */
public interface OrderService extends IService<Order> {

    PageUtils queryPage(Map<String, Object> params);
}

