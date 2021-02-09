package com.baomidou.ant.springbootmp.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 日程表
 * </p>
 *
 * @author jobob
 * @since 2021-02-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OaSchedule implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 开始时间
     */
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    private LocalDateTime endTime;

    /**
     * 会议室编号
     */
    private Long conferenceId;

    /**
     * 重复类型 0(不重复)、1（每天）、2（每周）、3（每月）、4（每年）
     */
    private Integer repeatType;

    /**
     * 提醒方式 0（不提醒）、 1（开始时）、2（5分钟前提醒）、3（15分钟前提醒）、4（30分钟前提醒）、5（1小时前提醒）、6（1天前提醒）
     */
    private Integer remindStyle;

    /**
     * 通知时间
     */
    private LocalDateTime noticeTime;

    /**
     * 描述
     */
    private String description;

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
