package com.codeman.gmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.order.entity.OrderReturnApply;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 11:18:11
 */
public interface OrderReturnApplyService extends IService<OrderReturnApply> {

    PageUtils queryPage(Map<String, Object> params);
}

