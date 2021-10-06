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

import com.codeman.gmall.product.entity.ProductAttrValue;
import com.codeman.gmall.product.service.ProductAttrValueService;
import com.codeman.common.utils.PageUtils;
import com.codeman.common.utils.R;



/**
 * spu属性值
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:55:13
 */
@Api(tags = "spu属性值Controller")
@RestController
@RequestMapping("product/productattrvalue")
public class ProductAttrValueController {
    @Autowired
    private ProductAttrValueService productAttrValueService;

    /**
     * 列表
     */
    @ApiOperation("spu属性值列表")
    @GetMapping("/list")
    //@RequiresPermissions("product:productattrvalue:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = productAttrValueService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 修改
     */
    @ApiOperation("spu属性值修改")
    @PutMapping("/update")
    //@RequiresPermissions("product:productattrvalue:update")
    public R update(@RequestBody ProductAttrValue productAttrValue){
            productAttrValueService.updateById(productAttrValue);

        return R.ok();
    }

    /**
     * 信息
     */
    @ApiOperation("spu属性值信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键", required = true, paramType = "path", dataType = "Long")
    })
    @GetMapping("/info/{id}")
    //@RequiresPermissions("product:productattrvalue:info")
    public R info(@PathVariable("id") Long id){
		ProductAttrValue productAttrValue = productAttrValueService.getById(id);

        return R.ok().put("productAttrValue", productAttrValue);
    }

    /**
     * 保存
     */
    @ApiOperation("spu属性值保存")
    @PostMapping("/save")
    //@RequiresPermissions("product:productattrvalue:save")
    public R save(@RequestBody ProductAttrValue productAttrValue){
		productAttrValueService.save(productAttrValue);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("spu属性值修删除")
    @DeleteMapping("/delete")
    //@RequiresPermissions("product:productattrvalue:delete")
    public R delete(@RequestBody Long[] ids){
		productAttrValueService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
