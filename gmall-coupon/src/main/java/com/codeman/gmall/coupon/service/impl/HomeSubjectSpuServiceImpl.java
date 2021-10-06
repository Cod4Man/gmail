package com.codeman.gmall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeman.common.utils.PageUtils;
import com.codeman.common.utils.Query;

import com.codeman.gmall.coupon.mapper.HomeSubjectSpuMapper;
import com.codeman.gmall.coupon.entity.HomeSubjectSpu;
import com.codeman.gmall.coupon.service.HomeSubjectSpuService;


@Service("homeSubjectSpuService")
public class HomeSubjectSpuServiceImpl extends ServiceImpl<HomeSubjectSpuMapper, HomeSubjectSpu> implements HomeSubjectSpuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeSubjectSpu> page = this.page(
                new Query<HomeSubjectSpu>().getPage(params),
                new QueryWrapper<HomeSubjectSpu>()
        );

        return new PageUtils(page);
    }

}