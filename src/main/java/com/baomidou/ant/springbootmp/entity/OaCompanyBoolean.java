package com.baomidou.ant.springbootmp.entity;

import org.springframework.stereotype.Component;

/**
 * @author PeiDong Yan
 * @date 2021/02/15 20:55
 */
@Component
public class OaCompanyBoolean {

    public Integer t2(boolean i){
        if(i==false){
            return 0;
        }
        else {
            return 1;
        }
    }

    public String t5(Integer i){
        if(i==0){
            return "00";
        }
        else {
            return "11";
        }
    }
    public boolean t3(Integer i){
        if(i==0){
            return false;
        }
        else {
            return true;
        }
    }
}
