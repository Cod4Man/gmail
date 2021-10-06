package com.codeman.gmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.product.entity.Brand;

import java.util.Map;

/**
 * 品牌
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:55:15
 */
public interface BrandService extends IService<Brand> {

    PageUtils queryPage(Map<String, Object> params);
}

