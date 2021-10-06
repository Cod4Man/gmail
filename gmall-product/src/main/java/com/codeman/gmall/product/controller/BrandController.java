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

import com.codeman.gmall.product.entity.Brand;
import com.codeman.gmall.product.service.BrandService;
import com.codeman.common.utils.PageUtils;
import com.codeman.common.utils.R;



/**
 * 品牌
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:55:15
 */
@Api(tags = "品牌Controller")
@RestController
@RequestMapping("product/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 列表
     */
    @ApiOperation("品牌列表")
    @GetMapping("/list")
    //@RequiresPermissions("product:brand:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = brandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 修改
     */
    @ApiOperation("品牌修改")
    @PutMapping("/update")
    //@RequiresPermissions("product:brand:update")
    public R update(@RequestBody Brand brand){
            brandService.updateById(brand);

        return R.ok();
    }

    /**
     * 信息
     */
    @ApiOperation("品牌信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "brandId", value = "主键", required = true, paramType = "path", dataType = "Long")
    })
    @GetMapping("/info/{brandId}")
    //@RequiresPermissions("product:brand:info")
    public R info(@PathVariable("brandId") Long brandId){
		Brand brand = brandService.getById(brandId);

        return R.ok().put("brand", brand);
    }

    /**
     * 保存
     */
    @ApiOperation("品牌保存")
    @PostMapping("/save")
    //@RequiresPermissions("product:brand:save")
    public R save(@RequestBody Brand brand){
		brandService.save(brand);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("品牌修删除")
    @DeleteMapping("/delete")
    //@RequiresPermissions("product:brand:delete")
    public R delete(@RequestBody Long[] brandIds){
		brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
