package com.alibaba.controller;

import com.alibaba.bean.Result;
import com.alibaba.bean.Teacher;
import com.alibaba.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 注册
     * @param Teacher 参数封装
     * @return Result
     */
    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    public Result regist(Teacher user){
        return userService.regist(user);
    }

    /**
     * 登录
     * @param Teacher 参数封装
     * @return Result
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(Teacher user){
        Result result = userService.login(user);
        if(result.isSuccess())
            return "redirect:/schedule.html";
        else
            return "redirect:/error";
    }
}

