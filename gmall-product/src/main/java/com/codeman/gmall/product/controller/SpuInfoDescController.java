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

import com.codeman.gmall.product.entity.SpuInfoDesc;
import com.codeman.gmall.product.service.SpuInfoDescService;
import com.codeman.common.utils.PageUtils;
import com.codeman.common.utils.R;



/**
 * spu信息介绍
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:55:14
 */
@Api(tags = "spu信息介绍Controller")
@RestController
@RequestMapping("product/spuinfodesc")
public class SpuInfoDescController {
    @Autowired
    private SpuInfoDescService spuInfoDescService;

    /**
     * 列表
     */
    @ApiOperation("spu信息介绍列表")
    @GetMapping("/list")
    //@RequiresPermissions("product:spuinfodesc:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = spuInfoDescService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 修改
     */
    @ApiOperation("spu信息介绍修改")
    @PutMapping("/update")
    //@RequiresPermissions("product:spuinfodesc:update")
    public R update(@RequestBody SpuInfoDesc spuInfoDesc){
            spuInfoDescService.updateById(spuInfoDesc);

        return R.ok();
    }

    /**
     * 信息
     */
    @ApiOperation("spu信息介绍信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "spuId", value = "主键", required = true, paramType = "path", dataType = "Long")
    })
    @GetMapping("/info/{spuId}")
    //@RequiresPermissions("product:spuinfodesc:info")
    public R info(@PathVariable("spuId") Long spuId){
		SpuInfoDesc spuInfoDesc = spuInfoDescService.getById(spuId);

        return R.ok().put("spuInfoDesc", spuInfoDesc);
    }

    /**
     * 保存
     */
    @ApiOperation("spu信息介绍保存")
    @PostMapping("/save")
    //@RequiresPermissions("product:spuinfodesc:save")
    public R save(@RequestBody SpuInfoDesc spuInfoDesc){
		spuInfoDescService.save(spuInfoDesc);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("spu信息介绍修删除")
    @DeleteMapping("/delete")
    //@RequiresPermissions("product:spuinfodesc:delete")
    public R delete(@RequestBody Long[] spuIds){
		spuInfoDescService.removeByIds(Arrays.asList(spuIds));

        return R.ok();
    }

}
