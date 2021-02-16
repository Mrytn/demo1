package com.baomidou.ant.springbootmp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author PeiDong Yan
 * @date 2021/02/15 15:29
 */
@RequestMapping("/da")
@RestController()
public class Test6 {
    @RequestMapping("/d2")
    public String test3(){
        return "d2";
    }
}
