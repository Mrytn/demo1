package com.baomidou.ant.springbootmp.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 图片附件表
 * </p>
 *
 * @author jobob
 * @since 2021-02-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OaPictureAttachment implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 模块 1 日程 2 公告 3 固定资产
     */
    private Integer module;

    /**
     * 各类型的id
     */
    private Long moduleId;

    /**
     * 类型 1 图片 2 附件
     */
    private Integer type;

    /**
     * 名称
     */
    private String name;

    /**
     * 地址
     */
    private String url;


}
