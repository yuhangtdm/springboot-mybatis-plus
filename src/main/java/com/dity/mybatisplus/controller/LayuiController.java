package com.dity.mybatisplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author:yuhang
 * @Date:2018/8/30
 */
@Controller
@RequestMapping("layui")
public class LayuiController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/welcome")
    public String welcome(){
        return "/welcome";
    }


    @RequestMapping("/member-list")
    public String  memberList(){
        return "/member-list";
    }


    @RequestMapping("/question-list")
    public String   questionList(){
        return "/question-list";
    }

    @RequestMapping("/login")
    public String   login(){
        return "/login";
    }
}
