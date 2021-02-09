package com.baomidou.ant.springbootmp.service.impl;

import com.baomidou.ant.springbootmp.entity.OaEmployee;
import com.baomidou.ant.springbootmp.mapper.OaEmployeeMapper;
import com.baomidou.ant.springbootmp.service.IOaEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工信息表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2021-02-09
 */
@Service
public class OaEmployeeServiceImpl extends ServiceImpl<OaEmployeeMapper, OaEmployee> implements IOaEmployeeService {

}
