package com.baomidou.ant.springbootmp.entity;


import lombok.Data;
import org.mapstruct.Mapper;

/**
 * @author PeiDong Yan
 * @date 2021/02/15 18:09
 */
@Data
public class OaCompanyDto {

    private String name;
    //private String area;
    private String province2;
    private boolean valid2;
    private boolean managerId;

}
