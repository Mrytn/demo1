package com.baomidou.ant.springbootmp.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 编号表
 * </p>
 *
 * @author jobob
 * @since 2021-02-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OaSerialNumber implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 上级
     */
    private Long parentId;

    /**
     * 分类 1（资产类别）
     */
    private Integer classify;

    /**
     * 名称
     */
    private String name;

    /**
     * 前缀
     */
    private String prefix;

    /**
     * 后缀长度
     */
    private Integer postfixLength;

    /**
     * 下一个资产编号后缀
     */
    private String nextPostfix;

    /**
     * 版本号
     */
    private Long version;

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
