package com.codeman.gmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 品牌
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:55:15
 */
@Data
@TableName("pms_brand")
@ApiModel(value="Brand对象", description="Brand")
public class Brand implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@TableId
	@ApiModelProperty(value = "品牌id")
	private Long brandId;
	/**
	 * 品牌名
	 */
	@ApiModelProperty(value = "品牌名")
	private String name;
	/**
	 * 品牌logo地址
	 */
	@ApiModelProperty(value = "品牌logo地址")
	private String logo;
	/**
	 * 介绍
	 */
	@ApiModelProperty(value = "介绍")
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	@ApiModelProperty(value = "显示状态[0-不显示；1-显示]")
	private Integer showStatus;
	/**
	 * 检索首字母
	 */
	@ApiModelProperty(value = "检索首字母")
	private String firstLetter;
	/**
	 * 排序
	 */
	@ApiModelProperty(value = "排序")
	private Integer sort;

}
