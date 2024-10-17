package com.lq.spacex.controller;

import com.lq.spacex.common.core.domain.ResponseEntity;
import com.lq.spacex.domain.vo.server.Server;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/monitor/server")
public class ServerController {
//    @PreAuthorize("@ss.hasPermi('monitor:server:list')")
    @GetMapping()
    public ResponseEntity getInfo() throws Exception
    {
        Server server = new Server();
        server.copyTo();
        return ResponseEntity.success(server);
    }
}
