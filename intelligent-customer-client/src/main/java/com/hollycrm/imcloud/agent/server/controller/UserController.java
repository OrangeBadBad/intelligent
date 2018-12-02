package com.hollycrm.imcloud.agent.server.controller;

import com.hollycrm.imcloud.customer.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author pengzc
 * @Description: TODO
 * @date 2018/11/2413:27
 */
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/usr/{id}")
    public User findById(@PathVariable Long id) {
        return new User();
    }
}
