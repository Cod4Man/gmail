package com.codeman.gmall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;

import com.codeman.gmall.coupon.entity.HomeAdv;
import com.codeman.gmall.coupon.service.HomeAdvService;
import com.codeman.common.utils.PageUtils;
import com.codeman.common.utils.R;



/**
 * 首页轮播广告
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:37:32
 */
@Api(tags = "首页轮播广告Controller")
@RestController
@RequestMapping("coupon/homeadv")
public class HomeAdvController {
    @Autowired
    private HomeAdvService homeAdvService;

    /**
     * 列表
     */
    @ApiOperation("首页轮播广告列表")
    @GetMapping("/list")
    //@RequiresPermissions("coupon:homeadv:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = homeAdvService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 修改
     */
    @ApiOperation("首页轮播广告修改")
    @PutMapping("/update")
    //@RequiresPermissions("coupon:homeadv:update")
    public R update(@RequestBody HomeAdv homeAdv){
            homeAdvService.updateById(homeAdv);

        return R.ok();
    }

    /**
     * 信息
     */
    @ApiOperation("首页轮播广告信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键", required = true, paramType = "path", dataType = "Long")
    })
    @GetMapping("/info/{id}")
    //@RequiresPermissions("coupon:homeadv:info")
    public R info(@PathVariable("id") Long id){
		HomeAdv homeAdv = homeAdvService.getById(id);

        return R.ok().put("homeAdv", homeAdv);
    }

    /**
     * 保存
     */
    @ApiOperation("首页轮播广告保存")
    @PostMapping("/save")
    //@RequiresPermissions("coupon:homeadv:save")
    public R save(@RequestBody HomeAdv homeAdv){
		homeAdvService.save(homeAdv);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("首页轮播广告修删除")
    @DeleteMapping("/delete")
    //@RequiresPermissions("coupon:homeadv:delete")
    public R delete(@RequestBody Long[] ids){
		homeAdvService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
