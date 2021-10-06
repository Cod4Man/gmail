package com.codeman.gmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.order.entity.PaymentInfo;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 11:18:12
 */
public interface PaymentInfoService extends IService<PaymentInfo> {

    PageUtils queryPage(Map<String, Object> params);
}

