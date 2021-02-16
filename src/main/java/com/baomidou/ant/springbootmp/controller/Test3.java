package com.baomidou.ant.springbootmp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author PeiDong Yan
 * @date 2021/02/15 15:29
 */
@RequestMapping("/d")
@RestController()
public class Test3 {
    @RequestMapping("/d2")
    public String test3(){
        return "d2";
    }
}
