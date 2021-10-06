package com.codeman.gmall.member.controller;

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

import com.codeman.gmall.member.entity.Member;
import com.codeman.gmall.member.service.MemberService;
import com.codeman.common.utils.PageUtils;
import com.codeman.common.utils.R;



/**
 * 会员
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:49:01
 */
@Api(tags = "会员Controller")
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    /**
     * 列表
     */
    @ApiOperation("会员列表")
    @GetMapping("/list")
    //@RequiresPermissions("member:member:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 修改
     */
    @ApiOperation("会员修改")
    @PutMapping("/update")
    //@RequiresPermissions("member:member:update")
    public R update(@RequestBody Member member){
            memberService.updateById(member);

        return R.ok();
    }

    /**
     * 信息
     */
    @ApiOperation("会员信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键", required = true, paramType = "path", dataType = "Long")
    })
    @GetMapping("/info/{id}")
    //@RequiresPermissions("member:member:info")
    public R info(@PathVariable("id") Long id){
		Member member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @ApiOperation("会员保存")
    @PostMapping("/save")
    //@RequiresPermissions("member:member:save")
    public R save(@RequestBody Member member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("会员修删除")
    @DeleteMapping("/delete")
    //@RequiresPermissions("member:member:delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
