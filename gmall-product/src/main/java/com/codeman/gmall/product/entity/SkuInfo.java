package com.codeman.gmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sku信息
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:55:13
 */
@Data
@TableName("pms_sku_info")
@ApiModel(value="SkuInfo对象", description="SkuInfo")
public class SkuInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * skuId
	 */
	@TableId
	@ApiModelProperty(value = "skuId")
	private Long skuId;
	/**
	 * spuId
	 */
	@ApiModelProperty(value = "spuId")
	private Long spuId;
	/**
	 * sku名称
	 */
	@ApiModelProperty(value = "sku名称")
	private String skuName;
	/**
	 * sku介绍描述
	 */
	@ApiModelProperty(value = "sku介绍描述")
	private String skuDesc;
	/**
	 * 所属分类id
	 */
	@ApiModelProperty(value = "所属分类id")
	private Long catalogId;
	/**
	 * 品牌id
	 */
	@ApiModelProperty(value = "品牌id")
	private Long brandId;
	/**
	 * 默认图片
	 */
	@ApiModelProperty(value = "默认图片")
	private String skuDefaultImg;
	/**
	 * 标题
	 */
	@ApiModelProperty(value = "标题")
	private String skuTitle;
	/**
	 * 副标题
	 */
	@ApiModelProperty(value = "副标题")
	private String skuSubtitle;
	/**
	 * 价格
	 */
	@ApiModelProperty(value = "价格")
	private BigDecimal price;
	/**
	 * 销量
	 */
	@ApiModelProperty(value = "销量")
	private Long saleCount;

}
