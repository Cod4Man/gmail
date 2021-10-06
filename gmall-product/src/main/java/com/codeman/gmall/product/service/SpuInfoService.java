package com.codeman.gmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.product.entity.SpuInfo;

import java.util.Map;

/**
 * spu信息
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:55:14
 */
public interface SpuInfoService extends IService<SpuInfo> {

    PageUtils queryPage(Map<String, Object> params);
}

