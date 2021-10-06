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

import com.codeman.gmall.coupon.entity.SkuLadder;
import com.codeman.gmall.coupon.service.SkuLadderService;
import com.codeman.common.utils.PageUtils;
import com.codeman.common.utils.R;



/**
 * 商品阶梯价格
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:37:33
 */
@Api(tags = "商品阶梯价格Controller")
@RestController
@RequestMapping("coupon/skuladder")
public class SkuLadderController {
    @Autowired
    private SkuLadderService skuLadderService;

    /**
     * 列表
     */
    @ApiOperation("商品阶梯价格列表")
    @GetMapping("/list")
    //@RequiresPermissions("coupon:skuladder:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = skuLadderService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 修改
     */
    @ApiOperation("商品阶梯价格修改")
    @PutMapping("/update")
    //@RequiresPermissions("coupon:skuladder:update")
    public R update(@RequestBody SkuLadder skuLadder){
            skuLadderService.updateById(skuLadder);

        return R.ok();
    }

    /**
     * 信息
     */
    @ApiOperation("商品阶梯价格信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键", required = true, paramType = "path", dataType = "Long")
    })
    @GetMapping("/info/{id}")
    //@RequiresPermissions("coupon:skuladder:info")
    public R info(@PathVariable("id") Long id){
		SkuLadder skuLadder = skuLadderService.getById(id);

        return R.ok().put("skuLadder", skuLadder);
    }

    /**
     * 保存
     */
    @ApiOperation("商品阶梯价格保存")
    @PostMapping("/save")
    //@RequiresPermissions("coupon:skuladder:save")
    public R save(@RequestBody SkuLadder skuLadder){
		skuLadderService.save(skuLadder);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("商品阶梯价格修删除")
    @DeleteMapping("/delete")
    //@RequiresPermissions("coupon:skuladder:delete")
    public R delete(@RequestBody Long[] ids){
		skuLadderService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
