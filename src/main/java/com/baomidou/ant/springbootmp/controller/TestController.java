package com.baomidou.ant.springbootmp.controller;

import com.baomidou.ant.springbootmp.entity.IntArray;
import com.baomidou.ant.springbootmp.entity.OaCompany;
import com.baomidou.ant.springbootmp.entity.OaCompanyDto;
import com.baomidou.ant.springbootmp.entity.OaCompanyUpdate;
import com.baomidou.ant.springbootmp.mapstruct.CompanyMapStruct;
import com.baomidou.ant.springbootmp.service.IOaCompanyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author PeiDong Yan
 * @date 2021/02/11 12:06
 */
@RestController
@RequestMapping("/cc")
@ResponseBody
public class TestController {

    @Resource
     private IOaCompanyService iOaCompanyService;

    @Resource
    private CompanyMapStruct CompanyMapStruct;

    @PostMapping("i")
    public  void i(OaCompany oaCompany) {
        iOaCompanyService.insert(oaCompany);
System.out.println(oaCompany.getId());
    }

    @PostMapping("u/{id}")
    public  OaCompany u(@PathVariable Integer id,@RequestBody OaCompanyUpdate oaCompany) {
        OaCompany c = iOaCompanyService.getById(id);
        CompanyMapStruct.update(oaCompany,c);
//        c.setProvince(null);
       iOaCompanyService.update(c);

        return c;
    }

    @PostMapping("d/{id}")
    public  void d(@PathVariable int id) {
        iOaCompanyService.delete(id);

    }
    @GetMapping("s")
    public OaCompanyDto s(int id) {
        OaCompany  c=iOaCompanyService.findById(id);
        //c.setName("cc");
        System.out.println(c.getCity());
        OaCompanyDto d = CompanyMapStruct.convert(c);
        //d.setName("cccccc");

return d;
    }
    @GetMapping("sl")
    public  void sl(@RequestBody int[] i) {
        List<OaCompany> cs=new ArrayList<>();
        for (Integer integer : i) {
            OaCompany  c=iOaCompanyService.findById(integer);
            cs.add(c);
        }
        List<OaCompanyDto> cc = CompanyMapStruct.converts(cs);
        System.out.println(cc);

    }
}
