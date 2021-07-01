package com.trkj.trainingprojects.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * advancearrange
 * @author 
 */
@Data
public class Advancearrange implements Serializable {
    /**
     * 排课编号
     */
    private Integer arrangeId;

    /**
     * 排课日期
     */
    private String arrangeDate;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 是否审核
     */
    private Integer isexamine;

    /**
     * 增加人
     */
    private String addname;

    /**
     * 培训时段编号
     */
    private Integer periodId;

    /**
     * 班级编号
     */
    private Integer classesId;

    /**
     * 教室编号
     */
    private Integer classroomId;

    /**
     * 教师编号
     */
    private Integer empId;

    private static final long serialVersionUID = 1L;
}