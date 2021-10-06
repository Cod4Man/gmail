package com.codeman.gmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.product.entity.Attr;

import java.util.Map;

/**
 * 商品属性
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:55:15
 */
public interface AttrService extends IService<Attr> {

    PageUtils queryPage(Map<String, Object> params);
}

