package com.codeman.gmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu信息介绍
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:55:14
 */
@Data
@TableName("pms_spu_info_desc")
@ApiModel(value="SpuInfoDesc对象", description="SpuInfoDesc")
public class SpuInfoDesc implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品id
	 */
	@TableId
	@ApiModelProperty(value = "商品id")
	private Long spuId;
	/**
	 * 商品介绍
	 */
	@ApiModelProperty(value = "商品介绍")
	private String decript;

}
