package com.baomidou.ant.springbootmp.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 通讯录表
 * </p>
 *
 * @author jobob
 * @since 2021-02-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OaAddressBook implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 员工编号
     */
    private Long employeeId;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 座机区号
     */
    private String landlineAreacode;

    /**
     * 座机号码
     */
    private String landlinePhone;

    /**
     * 内网分机
     */
    private String extensionNum;

    /**
     * 备用手机号
     */
    private String sparePhone;

    /**
     * 紧急联系人
     */
    private String emergencyContact;

    /**
     * 紧急联系人号码
     */
    private String emergencyContactPhone;

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
