package com.codeman.gmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.product.entity.Category;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:55:15
 */
public interface CategoryService extends IService<Category> {

    PageUtils queryPage(Map<String, Object> params);
}

