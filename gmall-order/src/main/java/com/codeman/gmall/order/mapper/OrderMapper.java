package com.codeman.gmall.order.mapper;

import com.codeman.gmall.order.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 11:18:10
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
	
}
