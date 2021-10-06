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

import com.codeman.gmall.coupon.entity.Coupon;
import com.codeman.gmall.coupon.service.CouponService;
import com.codeman.common.utils.PageUtils;
import com.codeman.common.utils.R;



/**
 * 优惠券信息
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:37:31
 */
@Api(tags = "优惠券信息Controller")
@RestController
@RequestMapping("coupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    /**
     * 列表
     */
    @ApiOperation("优惠券信息列表")
    @GetMapping("/list")
    //@RequiresPermissions("coupon:coupon:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 修改
     */
    @ApiOperation("优惠券信息修改")
    @PutMapping("/update")
    //@RequiresPermissions("coupon:coupon:update")
    public R update(@RequestBody Coupon coupon){
            couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 信息
     */
    @ApiOperation("优惠券信息信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键", required = true, paramType = "path", dataType = "Long")
    })
    @GetMapping("/info/{id}")
    //@RequiresPermissions("coupon:coupon:info")
    public R info(@PathVariable("id") Long id){
		Coupon coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @ApiOperation("优惠券信息保存")
    @PostMapping("/save")
    //@RequiresPermissions("coupon:coupon:save")
    public R save(@RequestBody Coupon coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("优惠券信息修删除")
    @DeleteMapping("/delete")
    //@RequiresPermissions("coupon:coupon:delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
