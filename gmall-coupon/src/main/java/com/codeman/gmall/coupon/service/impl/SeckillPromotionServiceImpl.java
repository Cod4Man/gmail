package com.codeman.gmall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeman.common.utils.PageUtils;
import com.codeman.common.utils.Query;

import com.codeman.gmall.coupon.mapper.SeckillPromotionMapper;
import com.codeman.gmall.coupon.entity.SeckillPromotion;
import com.codeman.gmall.coupon.service.SeckillPromotionService;


@Service("seckillPromotionService")
public class SeckillPromotionServiceImpl extends ServiceImpl<SeckillPromotionMapper, SeckillPromotion> implements SeckillPromotionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SeckillPromotion> page = this.page(
                new Query<SeckillPromotion>().getPage(params),
                new QueryWrapper<SeckillPromotion>()
        );

        return new PageUtils(page);
    }

}