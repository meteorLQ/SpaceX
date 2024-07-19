package com.lq.spacex.controller;



import com.lq.spacex.common.core.controller.BaseController;
import com.lq.spacex.common.core.domain.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author LQ
 * @since 2022-02-28
 */
@RestController
@RequestMapping
public class LoginController extends BaseController {

    @GetMapping("/admin_info")
    public ResponseEntity list() {
        return ResponseEntity.success();
    }
    @PostMapping("/login")
    public ResponseEntity login() {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("token","YNGLLXRTSLKBMHXRVUIPKBWIYDPGJQMV");

        return ResponseEntity.success(map);
    }
}

