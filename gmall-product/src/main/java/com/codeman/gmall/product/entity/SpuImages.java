package com.codeman.gmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu图片
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:55:14
 */
@Data
@TableName("pms_spu_images")
@ApiModel(value="SpuImages对象", description="SpuImages")
public class SpuImages implements Serializable {
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
	private Long spuId;
	/**
	 * 图片名
	 */
	@ApiModelProperty(value = "图片名")
	private String imgName;
	/**
	 * 图片地址
	 */
	@ApiModelProperty(value = "图片地址")
	private String imgUrl;
	/**
	 * 顺序
	 */
	@ApiModelProperty(value = "顺序")
	private Integer imgSort;
	/**
	 * 是否默认图
	 */
	@ApiModelProperty(value = "是否默认图")
	private Integer defaultImg;

}
