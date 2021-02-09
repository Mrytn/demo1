package com.baomidou.ant.springbootmp.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 员工公告表
 * </p>
 *
 * @author jobob
 * @since 2021-02-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OaEmployeeNotice implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 公告编号
     */
    private Long noticeId;

    /**
     * 员工编号
     */
    private Long employeeId;

    /**
     * 阅读状态
     */
    private Integer readState;


}
