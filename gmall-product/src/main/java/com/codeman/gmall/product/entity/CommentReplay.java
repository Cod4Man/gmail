package com.codeman.gmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品评价回复关系
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:55:12
 */
@Data
@TableName("pms_comment_replay")
@ApiModel(value="CommentReplay对象", description="CommentReplay")
public class CommentReplay implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(value = "id")
	private Long id;
	/**
	 * 评论id
	 */
	@ApiModelProperty(value = "评论id")
	private Long commentId;
	/**
	 * 回复id
	 */
	@ApiModelProperty(value = "回复id")
	private Long replyId;

}
