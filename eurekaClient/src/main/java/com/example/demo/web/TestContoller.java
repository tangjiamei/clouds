package com.example.demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tjm on 2019/11/28.
 */
@RestController
public class TestContoller {
    @Value("${hello}")
    String port;
    @RequestMapping("/")
    public String home() {
        return "hello world from port " + port; }

}
