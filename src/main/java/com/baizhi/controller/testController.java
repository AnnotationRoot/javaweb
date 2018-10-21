package com.baizhi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hello world on 2018/10/21.
 */
@RestController
@RequestMapping("/test")
public class testController {
    @RequestMapping("/test")
    public String test() {
        return "aaaaaa";
    }
}
