package com.codeman.gmall.product.controller;

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

import com.codeman.gmall.product.entity.SkuInfo;
import com.codeman.gmall.product.service.SkuInfoService;
import com.codeman.common.utils.PageUtils;
import com.codeman.common.utils.R;



/**
 * sku信息
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:55:13
 */
@Api(tags = "sku信息Controller")
@RestController
@RequestMapping("product/skuinfo")
public class SkuInfoController {
    @Autowired
    private SkuInfoService skuInfoService;

    /**
     * 列表
     */
    @ApiOperation("sku信息列表")
    @GetMapping("/list")
    //@RequiresPermissions("product:skuinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = skuInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 修改
     */
    @ApiOperation("sku信息修改")
    @PutMapping("/update")
    //@RequiresPermissions("product:skuinfo:update")
    public R update(@RequestBody SkuInfo skuInfo){
            skuInfoService.updateById(skuInfo);

        return R.ok();
    }

    /**
     * 信息
     */
    @ApiOperation("sku信息信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "skuId", value = "主键", required = true, paramType = "path", dataType = "Long")
    })
    @GetMapping("/info/{skuId}")
    //@RequiresPermissions("product:skuinfo:info")
    public R info(@PathVariable("skuId") Long skuId){
		SkuInfo skuInfo = skuInfoService.getById(skuId);

        return R.ok().put("skuInfo", skuInfo);
    }

    /**
     * 保存
     */
    @ApiOperation("sku信息保存")
    @PostMapping("/save")
    //@RequiresPermissions("product:skuinfo:save")
    public R save(@RequestBody SkuInfo skuInfo){
		skuInfoService.save(skuInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("sku信息修删除")
    @DeleteMapping("/delete")
    //@RequiresPermissions("product:skuinfo:delete")
    public R delete(@RequestBody Long[] skuIds){
		skuInfoService.removeByIds(Arrays.asList(skuIds));

        return R.ok();
    }

}
