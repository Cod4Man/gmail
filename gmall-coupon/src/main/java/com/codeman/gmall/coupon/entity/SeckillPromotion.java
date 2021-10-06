package com.codeman.gmall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 秒杀活动
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:37:32
 */
@Data
@TableName("sms_seckill_promotion")
@ApiModel(value="SeckillPromotion对象", description="SeckillPromotion")
public class SeckillPromotion implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(value = "id")
	private Long id;
	/**
	 * 活动标题
	 */
	@ApiModelProperty(value = "活动标题")
	private String title;
	/**
	 * 开始日期
	 */
	@ApiModelProperty(value = "开始日期")
	private Date startTime;
	/**
	 * 结束日期
	 */
	@ApiModelProperty(value = "结束日期")
	private Date endTime;
	/**
	 * 上下线状态
	 */
	@ApiModelProperty(value = "上下线状态")
	private Integer status;
	/**
	 * 创建时间
	 */
	@ApiModelProperty(value = "创建时间")
	private Date createTime;
	/**
	 * 创建人
	 */
	@ApiModelProperty(value = "创建人")
	private Long userId;

}
