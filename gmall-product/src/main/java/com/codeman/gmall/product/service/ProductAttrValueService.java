package com.codeman.gmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.product.entity.ProductAttrValue;

import java.util.Map;

/**
 * spu属性值
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:55:13
 */
public interface ProductAttrValueService extends IService<ProductAttrValue> {

    PageUtils queryPage(Map<String, Object> params);
}

