package com.codeman.gmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.product.entity.CategoryBrandRelation;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:55:14
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelation> {

    PageUtils queryPage(Map<String, Object> params);
}

