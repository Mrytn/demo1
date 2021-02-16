package com.baomidou.ant.springbootmp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author PeiDong Yan
 * @date 2021/02/09 10:46
 */
@RequestMapping("/ga")
@RestController()
public class Test5 {
    @RequestMapping("/g2")
    public String test2(){
        return "g2";
    }
}
