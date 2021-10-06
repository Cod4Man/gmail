package com.codeman.gmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.product.entity.SkuSaleAttrValue;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:55:13
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValue> {

    PageUtils queryPage(Map<String, Object> params);
}

