package com.hollycrm.imcloud.agent.server.controller;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengzc
 * @Description: test controller
 * @date 2018/11/2416:54
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private DiscoveryClient discoveryClient;
}
