package com.trkj.trainingprojects.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * arrange
 * @author 
 */
@Data
public class Arrange implements Serializable {
    /**
     * 排课编号
     */
    private Integer arrangeId;

    /**
     * 排课日期
     */
    private Date arrangeDate;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 是否审核
     */
    private Integer isexamine;

    /**
     * 审核时间
     */
    private Date examinetime;

    /**
     * 审核人
     */
    private String examinename;

    /**
     * 撤销审核时间
     */
    private Date revoketime;

    /**
     * 撤销审核人
     */
    private String revokename;

    /**
     * 增加人
     */
    private String addname;

    /**
     * 增加日期
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

    /**
     * 课程详细编号
     */
    private Integer coursedetailsId;

    private static final long serialVersionUID = 1L;
}