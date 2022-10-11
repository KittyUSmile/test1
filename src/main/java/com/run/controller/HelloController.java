package com.run.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2022/09/18/18:40
 * @Description:
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping()
    public String test01(){
        return "Hello test01";
    }

    @GetMapping("/test02")
    public String test02(){
        return "test02";
    }

}
