package com.trkj.trainingprojects.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 培训时段表(TrainingPeriod)实体类
 *
 * @author makejava
 * @since 2021-06-04 11:33:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainingPeriod implements Serializable {
    /**
     * 时段编号
     */
    private Integer periodId;
    /**
     * 时段名称
     */
    private String period;
    /**
     * 增加人
     */
    private String addname;
    /**
     * 增加时间
     */
    private Date addtime;
    /**
     * 最后修改人
     */
    private String updatename;
    /**
     * 最后修改时间
     */
    private Date updatetime;
    /**
     * 删除人
     */
    private String deletename;
    /**
     * 删除时间
     */
    private Date deletetime;
    /**
     * 时效性
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}
