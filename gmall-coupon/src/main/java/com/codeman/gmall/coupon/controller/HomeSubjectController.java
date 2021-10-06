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

import com.codeman.gmall.coupon.entity.HomeSubject;
import com.codeman.gmall.coupon.service.HomeSubjectService;
import com.codeman.common.utils.PageUtils;
import com.codeman.common.utils.R;



/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:37:32
 */
@Api(tags = "首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】Controller")
@RestController
@RequestMapping("coupon/homesubject")
public class HomeSubjectController {
    @Autowired
    private HomeSubjectService homeSubjectService;

    /**
     * 列表
     */
    @ApiOperation("首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】列表")
    @GetMapping("/list")
    //@RequiresPermissions("coupon:homesubject:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = homeSubjectService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 修改
     */
    @ApiOperation("首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】修改")
    @PutMapping("/update")
    //@RequiresPermissions("coupon:homesubject:update")
    public R update(@RequestBody HomeSubject homeSubject){
            homeSubjectService.updateById(homeSubject);

        return R.ok();
    }

    /**
     * 信息
     */
    @ApiOperation("首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键", required = true, paramType = "path", dataType = "Long")
    })
    @GetMapping("/info/{id}")
    //@RequiresPermissions("coupon:homesubject:info")
    public R info(@PathVariable("id") Long id){
		HomeSubject homeSubject = homeSubjectService.getById(id);

        return R.ok().put("homeSubject", homeSubject);
    }

    /**
     * 保存
     */
    @ApiOperation("首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】保存")
    @PostMapping("/save")
    //@RequiresPermissions("coupon:homesubject:save")
    public R save(@RequestBody HomeSubject homeSubject){
		homeSubjectService.save(homeSubject);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】修删除")
    @DeleteMapping("/delete")
    //@RequiresPermissions("coupon:homesubject:delete")
    public R delete(@RequestBody Long[] ids){
		homeSubjectService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
