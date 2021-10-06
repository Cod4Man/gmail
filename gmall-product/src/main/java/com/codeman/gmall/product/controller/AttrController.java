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

import com.codeman.gmall.product.entity.Attr;
import com.codeman.gmall.product.service.AttrService;
import com.codeman.common.utils.PageUtils;
import com.codeman.common.utils.R;



/**
 * 商品属性
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:55:15
 */
@Api(tags = "商品属性Controller")
@RestController
@RequestMapping("product/attr")
public class AttrController {
    @Autowired
    private AttrService attrService;

    /**
     * 列表
     */
    @ApiOperation("商品属性列表")
    @GetMapping("/list")
    //@RequiresPermissions("product:attr:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = attrService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 修改
     */
    @ApiOperation("商品属性修改")
    @PutMapping("/update")
    //@RequiresPermissions("product:attr:update")
    public R update(@RequestBody Attr attr){
            attrService.updateById(attr);

        return R.ok();
    }

    /**
     * 信息
     */
    @ApiOperation("商品属性信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "attrId", value = "主键", required = true, paramType = "path", dataType = "Long")
    })
    @GetMapping("/info/{attrId}")
    //@RequiresPermissions("product:attr:info")
    public R info(@PathVariable("attrId") Long attrId){
		Attr attr = attrService.getById(attrId);

        return R.ok().put("attr", attr);
    }

    /**
     * 保存
     */
    @ApiOperation("商品属性保存")
    @PostMapping("/save")
    //@RequiresPermissions("product:attr:save")
    public R save(@RequestBody Attr attr){
		attrService.save(attr);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("商品属性修删除")
    @DeleteMapping("/delete")
    //@RequiresPermissions("product:attr:delete")
    public R delete(@RequestBody Long[] attrIds){
		attrService.removeByIds(Arrays.asList(attrIds));

        return R.ok();
    }

}
