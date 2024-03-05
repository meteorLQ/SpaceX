package com.lq.spacex.controller;


import com.lq.spacex.domain.entity.User;
import com.lq.spacex.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;
    @GetMapping("/get")
    @ResponseBody
    public List<User> getUser(){
        return userService.list();
    }
}

