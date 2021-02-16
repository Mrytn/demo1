package com.baomidou.ant.springbootmp.controller;

import com.baomidou.ant.springbootmp.entity.OaCompany;
import com.baomidou.ant.springbootmp.service.IOaCompanyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author PeiDong Yan
 * @date 2021/02/11 16:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Test5.class)
public class Test5 {
    @Resource
    private IOaCompanyService iOaCompanyService;
    @Test
    public  void t() {
        int i = 1;
        OaCompany  c=iOaCompanyService.findById(1);
        System.out.println(c);

    }
}
