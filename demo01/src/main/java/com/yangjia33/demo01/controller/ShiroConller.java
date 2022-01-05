package com.yangjia33.demo01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangjia33@outlook.com
 * @version 1.0.0
 * @Description Shiro测试类
 * @createTime 2022-01-03 23:16
 */
@RestController
public class ShiroConller {

    @GetMapping("hello")
    public String hello(){
        return "hello Shiro!";
    }
}
