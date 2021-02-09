package com.baomidou.ant.springbootmp.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 固定资产使用记录表
 * </p>
 *
 * @author jobob
 * @since 2021-02-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OaFixedAssetsUseAccord implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 资产编号
     */
    private Long assetId;

    /**
     * 使用人
     */
    private Long userId;

    /**
     * 开始日期
     */
    private LocalDate startDate;

    /**
     * 结束日期
     */
    private LocalDate endDate;


}
