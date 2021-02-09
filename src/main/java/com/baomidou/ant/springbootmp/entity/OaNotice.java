package com.baomidou.ant.springbootmp.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 通知公告表
 * </p>
 *
 * @author jobob
 * @since 2021-02-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OaNotice implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 类型 1 通知  2 公告 3系统通知
     */
    private Integer type;

    /**
     * 发布状态
     */
    private Integer publish;

    /**
     * 发布日期
     */
    private LocalDate publishDate;

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
