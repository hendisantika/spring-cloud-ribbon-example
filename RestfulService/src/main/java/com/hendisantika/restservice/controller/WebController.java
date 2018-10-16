package com.hendisantika.restservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : RestfulService
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/11/17
 * Time: 17.28
 * To change this template use File | Settings | File Templates.
 */

@RestController
@Component
public class WebController {
    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/")
    public String home() {
        return "Okay!";
    }

    @RequestMapping("/greeting")
    public String hello() {
        return "Hello from a service running at port: " + port + "!";
    }
}
