package com.baomidou.ant.springbootmp.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 排班表
 * </p>
 *
 * @author jobob
 * @since 2021-02-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OaWorkSchedule implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 日期
     */
    private LocalDate workDate;

    /**
     * 日期属性 1 工作日 2 休息日 3 法定假日
     */
    private Integer dateAttr;


}
