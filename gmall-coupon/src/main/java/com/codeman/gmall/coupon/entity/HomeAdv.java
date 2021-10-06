package com.codeman.gmall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 首页轮播广告
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:37:32
 */
@Data
@TableName("sms_home_adv")
@ApiModel(value="HomeAdv对象", description="HomeAdv")
public class HomeAdv implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(value = "id")
	private Long id;
	/**
	 * 名字
	 */
	@ApiModelProperty(value = "名字")
	private String name;
	/**
	 * 图片地址
	 */
	@ApiModelProperty(value = "图片地址")
	private String pic;
	/**
	 * 开始时间
	 */
	@ApiModelProperty(value = "开始时间")
	private Date startTime;
	/**
	 * 结束时间
	 */
	@ApiModelProperty(value = "结束时间")
	private Date endTime;
	/**
	 * 状态
	 */
	@ApiModelProperty(value = "状态")
	private Integer status;
	/**
	 * 点击数
	 */
	@ApiModelProperty(value = "点击数")
	private Integer clickCount;
	/**
	 * 广告详情连接地址
	 */
	@ApiModelProperty(value = "广告详情连接地址")
	private String url;
	/**
	 * 备注
	 */
	@ApiModelProperty(value = "备注")
	private String note;
	/**
	 * 排序
	 */
	@ApiModelProperty(value = "排序")
	private Integer sort;
	/**
	 * 发布者
	 */
	@ApiModelProperty(value = "发布者")
	private Long publisherId;
	/**
	 * 审核者
	 */
	@ApiModelProperty(value = "审核者")
	private Long authId;

}
