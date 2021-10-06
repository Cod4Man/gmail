package com.codeman.gmall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 优惠券分类关联
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:37:31
 */
@Data
@TableName("sms_coupon_spu_category_relation")
@ApiModel(value="CouponSpuCategoryRelation对象", description="CouponSpuCategoryRelation")
public class CouponSpuCategoryRelation implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(value = "id")
	private Long id;
	/**
	 * 优惠券id
	 */
	@ApiModelProperty(value = "优惠券id")
	private Long couponId;
	/**
	 * 产品分类id
	 */
	@ApiModelProperty(value = "产品分类id")
	private Long categoryId;
	/**
	 * 产品分类名称
	 */
	@ApiModelProperty(value = "产品分类名称")
	private String categoryName;

}
