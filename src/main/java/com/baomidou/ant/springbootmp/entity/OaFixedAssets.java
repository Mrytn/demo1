package com.baomidou.ant.springbootmp.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 固定资产表
 * </p>
 *
 * @author jobob
 * @since 2021-02-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OaFixedAssets implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 资产类别编号
     */
    private Long assetTypeId;

    /**
     * 公司编号
     */
    private Long companyId;

    /**
     * 部门编号
     */
    private Long deptId;

    /**
     * 资产编码
     */
    private String assetNum;

    /**
     * 资产名称
     */
    private String name;

    /**
     * 规格型号
     */
    private String specifications;

    /**
     * 单价(分)
     */
    private Long unitPrice;

    /**
     * 数量
     */
    private Long amount;

    /**
     * 总金额（分）
     */
    private Long totalPrice;

    /**
     * 购置日期
     */
    private LocalDate acquisitionDate;

    /**
     * 存放地
     */
    private String storagePlace;

    /**
     * 关联采购单
     */
    private String purchaseId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 自定义属性
     */
    private String definedProperty;

    /**
     * 资产状态 1 在用 2 报废
     */
    private Integer useState;

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
