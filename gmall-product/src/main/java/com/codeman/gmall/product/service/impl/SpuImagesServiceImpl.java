package com.codeman.gmall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeman.common.utils.PageUtils;
import com.codeman.common.utils.Query;

import com.codeman.gmall.product.mapper.SpuImagesMapper;
import com.codeman.gmall.product.entity.SpuImages;
import com.codeman.gmall.product.service.SpuImagesService;


@Service("spuImagesService")
public class SpuImagesServiceImpl extends ServiceImpl<SpuImagesMapper, SpuImages> implements SpuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuImages> page = this.page(
                new Query<SpuImages>().getPage(params),
                new QueryWrapper<SpuImages>()
        );

        return new PageUtils(page);
    }

}