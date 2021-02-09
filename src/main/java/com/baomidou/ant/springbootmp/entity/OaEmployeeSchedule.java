package com.baomidou.ant.springbootmp.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 员工日程表
 * </p>
 *
 * @author jobob
 * @since 2021-02-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OaEmployeeSchedule implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 日程编号
     */
    private Long scheduleId;

    /**
     * 员工编号
     */
    private Long employeeId;

    /**
     * 响应状态 1 未响应 2 已接受 3 已拒绝
     */
    private Integer state;


}
