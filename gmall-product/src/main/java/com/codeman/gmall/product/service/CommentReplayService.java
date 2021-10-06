package com.codeman.gmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.product.entity.CommentReplay;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:55:12
 */
public interface CommentReplayService extends IService<CommentReplay> {

    PageUtils queryPage(Map<String, Object> params);
}

