package com.baomidou.ant.springbootmp.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 员工信息表
 * </p>
 *
 * @author jobob
 * @since 2021-02-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OaEmployee implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 用户编号
     */
    private Long userId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 婚否
     */
    private Integer married;

    /**
     * 学历
     */
    private String education;

    /**
     * 出生日期
     */
    private LocalDate birth;

    /**
     * 参加工作日期
     */
    private LocalDate startworkDate;

    /**
     * 专业
     */
    private String major;

    /**
     * 身份证
     */
    private String identityCard;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 家庭住址
     */
    private String homeAddress;

    /**
     * 银行账号
     */
    private String bankAccount;

    /**
     * 支行
     */
    private String subBranch;

    /**
     * 入职时间
     */
    private LocalDate entryDate;

    /**
     * 转正时间
     */
    private LocalDate applyDate;

    /**
     * 岗位
     */
    private Long jobId;

    /**
     * 直属领导
     */
    private Long leader;

    /**
     * 第一次合同开始日期
     */
    private LocalDate firstContractStartdate;

    /**
     * 第一次合同结束日期
     */
    private LocalDate firstContractEnddate;

    /**
     * 第二次合同开始日期
     */
    private LocalDate secondContractStartdate;

    /**
     * 第二次合同结束日期
     */
    private LocalDate secondContractEnddate;

    /**
     * 无固定期限合同
     */
    private Integer unfixedTermContract;

    /**
     * 在职状态 1 在职 ,2 离职
     */
    private Integer state;

    /**
     * 员工属性 1 正式员工 2 非正式员工
     */
    private Integer employeeAttr;

    /**
     * 员工属性备注
     */
    private String employeeAttrRemark;

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
