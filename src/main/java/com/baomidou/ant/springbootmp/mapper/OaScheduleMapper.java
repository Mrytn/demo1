package com.baomidou.ant.springbootmp.mapper;

import com.baomidou.ant.springbootmp.entity.OaSchedule;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 日程表 Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2021-02-09
 */
@Mapper
@Repository
public interface OaScheduleMapper extends BaseMapper<OaSchedule> {

}
