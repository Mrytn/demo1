package com.baomidou.ant.springbootmp.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 公司部门信息表
 * </p>
 *
 * @author jobob
 * @since 2021-02-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OaDept implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 上级部门
     */
    private Long parentId;

    /**
     * 公司编号
     */
    private Long companyId;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 部门负责人
     */
    private Long managerId;

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
