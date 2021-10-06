package com.codeman.gmall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品满减信息
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:37:33
 */
@Data
@TableName("sms_sku_full_reduction")
@ApiModel(value="SkuFullReduction对象", description="SkuFullReduction")
public class SkuFullReduction implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(value = "id")
	private Long id;
	/**
	 * spu_id
	 */
	@ApiModelProperty(value = "spu_id")
	private Long skuId;
	/**
	 * 满多少
	 */
	@ApiModelProperty(value = "满多少")
	private BigDecimal fullPrice;
	/**
	 * 减多少
	 */
	@ApiModelProperty(value = "减多少")
	private BigDecimal reducePrice;
	/**
	 * 是否参与其他优惠
	 */
	@ApiModelProperty(value = "是否参与其他优惠")
	private Integer addOther;

}