package com.dity.mybatisplus.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:yuhang
 * @Date:2018/8/22
 */
@RestController
@RequestMapping("/user")
@Api("swagger ui 注释 api 级别")
public class HelloWorldController {

    @ApiOperation("swagger ui 注释 方法级别")
    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public  String hello() {
        String data = "Never trouble untill trouble troubles you. Some one told me some years ago.";
        return data;
    }
}
