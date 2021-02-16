package com.baomidou.ant.springbootmp.service.impl;

import com.baomidou.ant.springbootmp.entity.OaCompany;
import com.baomidou.ant.springbootmp.mapper.OaCompanyMapper;
import com.baomidou.ant.springbootmp.service.IOaCompanyService;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;


/**
 * <p>
 * 公司信息表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2021-02-09
 */
@Service
public class OaCompanyServiceImpl extends ServiceImpl<OaCompanyMapper, OaCompany> implements IOaCompanyService {

    @Override
    public void insert(OaCompany oaCompany) {
        baseMapper.insert(oaCompany);

    }

    @Override
    public void update(OaCompany resource) {

        //baseMapper.updateById(resource);
//        baseMapper.update(new OaCompany().setName("1"), Wrappers.<OaCompany>lambdaUpdate()
//                .set(OaCompany::getProvince, null).eq(OaCompany::getId,resource.getId()));
        baseMapper.update(null, Wrappers.<OaCompany>lambdaUpdate()
                .set(OaCompany::getName, resource.getName())
                .set(OaCompany::getProvince, null)
                .eq(OaCompany::getId, resource.getId()));

    }

    @Override
    public void delete(Integer id) {
        baseMapper.deleteById(id);

    }

    @Override
    public OaCompany findById(Integer id) {
        int q=1;
        OaCompany c=baseMapper.selectById(id);
        return c;
    }

    @Override
    public void init() {

    }
}
