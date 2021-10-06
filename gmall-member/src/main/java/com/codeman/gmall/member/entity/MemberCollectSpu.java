package com.codeman.gmall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员收藏的商品
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:49:01
 */
@Data
@TableName("ums_member_collect_spu")
@ApiModel(value="MemberCollectSpu对象", description="MemberCollectSpu")
public class MemberCollectSpu implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(value = "id")
	private Long id;
	/**
	 * 会员id
	 */
	@ApiModelProperty(value = "会员id")
	private Long memberId;
	/**
	 * spu_id
	 */
	@ApiModelProperty(value = "spu_id")
	private Long spuId;
	/**
	 * spu_name
	 */
	@ApiModelProperty(value = "spu_name")
	private String spuName;
	/**
	 * spu_img
	 */
	@ApiModelProperty(value = "spu_img")
	private String spuImg;
	/**
	 * create_time
	 */
	@ApiModelProperty(value = "create_time")
	private Date createTime;

}
