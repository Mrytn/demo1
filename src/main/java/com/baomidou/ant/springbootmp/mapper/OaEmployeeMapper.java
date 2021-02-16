package com.baomidou.ant.springbootmp.mapper;

import com.baomidou.ant.springbootmp.entity.OaEmployee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 员工信息表 Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2021-02-09
 */
@Mapper
@Repository
public interface OaEmployeeMapper extends BaseMapper<OaEmployee> {

}
