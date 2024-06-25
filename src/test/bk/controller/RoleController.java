//package com.lq.spacex.controller;
//
//import com.google.common.collect.Lists;
//import com.lq.spacex.common.core.controller.BaseController;
//import com.lq.spacex.common.core.domain.ResponseEntity;
//import com.lq.spacex.domain.entity.Role;
//import com.lq.spacex.domain.entity.User;
//import com.lq.spacex.service.IRoleService;
//import com.lq.spacex.service.IUserService;
//import org.checkerframework.checker.nullness.qual.Nullable;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping("/role")
//public class RoleController extends BaseController {
//    @Autowired
//    IRoleService roleService;
//    @GetMapping("/get")
//    @ResponseBody
//    public ResponseEntity getRole(){
//        startPage();
//        List<Role> list = roleService.list();
//        return ResponseEntity.success(getDataTable(list));
//    }
//
//    @PostMapping("/save")
//    public void saveRole(@RequestBody @Validated Role role){
//        ArrayList<@Nullable Object> objects = Lists.newArrayListWithCapacity(10);
////        Role.builder().menuId(1).menuIds(objects).deptIds(objects).build();
//        roleService.saveOrUpdate(role);
//    }
//}
