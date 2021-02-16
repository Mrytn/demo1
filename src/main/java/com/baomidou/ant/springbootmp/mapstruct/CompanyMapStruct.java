package com.baomidou.ant.springbootmp.mapstruct;

import com.baomidou.ant.springbootmp.entity.OaCompany;
import com.baomidou.ant.springbootmp.entity.OaCompanyBoolean;
import com.baomidou.ant.springbootmp.entity.OaCompanyDto;
import com.baomidou.ant.springbootmp.entity.OaCompanyUpdate;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author PeiDong Yan
 * @date 2021/02/15 16:20
 */
@Mapper(componentModel = "spring",uses = OaCompanyBoolean.class)
public interface CompanyMapStruct {
    //CompanyMapStruct INSTANCE = Mappers.getMapper(CompanyMapStruct.class);
    //@Mapping(source = "province",target = "province")
    @Mappings({@Mapping(source = "province",target = "province2"),@Mapping(source = "valid",target = "valid2")})
    OaCompanyDto convert(OaCompany OaCompany);
    //@Mappings({@Mapping(source = "province",target = "province2"),@Mapping(source = "valid",target = "valid2")})
    List<OaCompanyDto> converts(List<OaCompany> OaCompany);
    @Mapping(source = "province3",target = "province")
    OaCompany update(OaCompanyUpdate o, @MappingTarget OaCompany o2);
//    default OaCompanyDto OaCompanyToOaCompanyDto(OaCompany OaCompany){
//        OaCompanyDto c2=new OaCompanyDto();
//if(OaCompany.getName()=="公司03"){
//
//            c2.setName("ccc");
//}
//
//
//  return c2;
//    }
}
