package com.baomidou.ant.springbootmp.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 公司部门员工关系表
 * </p>
 *
 * @author jobob
 * @since 2021-02-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OaCompanyDeptJobEmployee implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 公司编号
     */
    private Long companyId;

    /**
     * 部门编号
     */
    private Long deptId;

    /**
     * 员工编号
     */
    private Long employeeId;

    /**
     * 有效
     */
    private Integer valid;

    /**
     * 创建者
     */
    private Long createUser;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
