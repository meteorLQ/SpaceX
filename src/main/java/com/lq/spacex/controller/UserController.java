package com.lq.spacex.controller;


import com.lq.spacex.common.core.controller.BaseController;
import com.lq.spacex.common.core.domain.ResponseEntity;
import com.lq.spacex.domain.entity.User;
import com.lq.spacex.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/user")
public class UserController  extends BaseController {
    @Autowired
    IUserService userService;
    @GetMapping("/get")
    @ResponseBody
    public ResponseEntity getUser(){
        startPage();
        List<User> list = userService.list();
        return ResponseEntity.success(getDataTable(list));
    }

    @PostMapping("/save")
    public void saveUser(@RequestBody @Validated User user){
        userService.saveOrUpdate(user);
    }
}

