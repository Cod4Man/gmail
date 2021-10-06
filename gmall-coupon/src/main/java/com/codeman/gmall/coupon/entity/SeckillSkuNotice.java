package com.codeman.gmall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 秒杀商品通知订阅
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:37:33
 */
@Data
@TableName("sms_seckill_sku_notice")
@ApiModel(value="SeckillSkuNotice对象", description="SeckillSkuNotice")
public class SeckillSkuNotice implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(value = "id")
	private Long id;
	/**
	 * member_id
	 */
	@ApiModelProperty(value = "member_id")
	private Long memberId;
	/**
	 * sku_id
	 */
	@ApiModelProperty(value = "sku_id")
	private Long skuId;
	/**
	 * 活动场次id
	 */
	@ApiModelProperty(value = "活动场次id")
	private Long sessionId;
	/**
	 * 订阅时间
	 */
	@ApiModelProperty(value = "订阅时间")
	private Date subcribeTime;
	/**
	 * 发送时间
	 */
	@ApiModelProperty(value = "发送时间")
	private Date sendTime;
	/**
	 * 通知方式[0-短信，1-邮件]
	 */
	@ApiModelProperty(value = "通知方式[0-短信，1-邮件]")
	private Integer noticeType;

}
