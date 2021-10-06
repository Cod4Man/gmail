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

import com.codeman.gmall.product.entity.SkuImages;
import com.codeman.gmall.product.service.SkuImagesService;
import com.codeman.common.utils.PageUtils;
import com.codeman.common.utils.R;



/**
 * sku图片
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:55:13
 */
@Api(tags = "sku图片Controller")
@RestController
@RequestMapping("product/skuimages")
public class SkuImagesController {
    @Autowired
    private SkuImagesService skuImagesService;

    /**
     * 列表
     */
    @ApiOperation("sku图片列表")
    @GetMapping("/list")
    //@RequiresPermissions("product:skuimages:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = skuImagesService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 修改
     */
    @ApiOperation("sku图片修改")
    @PutMapping("/update")
    //@RequiresPermissions("product:skuimages:update")
    public R update(@RequestBody SkuImages skuImages){
            skuImagesService.updateById(skuImages);

        return R.ok();
    }

    /**
     * 信息
     */
    @ApiOperation("sku图片信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键", required = true, paramType = "path", dataType = "Long")
    })
    @GetMapping("/info/{id}")
    //@RequiresPermissions("product:skuimages:info")
    public R info(@PathVariable("id") Long id){
		SkuImages skuImages = skuImagesService.getById(id);

        return R.ok().put("skuImages", skuImages);
    }

    /**
     * 保存
     */
    @ApiOperation("sku图片保存")
    @PostMapping("/save")
    //@RequiresPermissions("product:skuimages:save")
    public R save(@RequestBody SkuImages skuImages){
		skuImagesService.save(skuImages);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("sku图片修删除")
    @DeleteMapping("/delete")
    //@RequiresPermissions("product:skuimages:delete")
    public R delete(@RequestBody Long[] ids){
		skuImagesService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
