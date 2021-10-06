package com.codeman.gmall.order.mapper;

import com.codeman.gmall.order.entity.OrderOperateHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 11:18:11
 */
@Mapper
public interface OrderOperateHistoryMapper extends BaseMapper<OrderOperateHistory> {
	
}
