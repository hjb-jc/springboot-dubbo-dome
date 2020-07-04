package com.gk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gk.entity.User;
import com.gk.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Reference(version = "1.0.1") //版本号   与提供服务接口相对应
    private UserService userService;

    @RequestMapping("/selUser")
    @ResponseBody
    public List<User> getUserList(){
        return userService.findAll();
    }

}
