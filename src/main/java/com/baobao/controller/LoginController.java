package com.baobao.controller;

import com.baobao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bwh
 * @date 2020/9/9 - 15:03
 * @Description
 */
@RestController
@RequestMapping("/auth")
public class LoginController {

    @Autowired
    private UserService userService;


    @GetMapping("/login")
    public String login(String username, String password){
        return userService.login(username, password);
    }

    @GetMapping("test")
    public String test(){
        return "test";
    }

}
