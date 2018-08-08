package com.liuchaoya.controller;

import com.liuchaoya.common.bean.ResponseBean;
import com.liuchaoya.pojo.User;
import com.liuchaoya.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by LiuChaoya on 2018/8/2 0002 16:53.
 * email  1090969255@qq.com
 */

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/addUser")
    public ResponseBean addUser(User user){
        return userService.insertUser(user);
    }

    @RequestMapping("/login")
    public ResponseBean login(User user){
        return userService.login(user);
    }
}
