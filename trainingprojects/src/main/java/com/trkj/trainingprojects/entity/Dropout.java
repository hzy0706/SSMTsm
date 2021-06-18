package com.trkj.trainingprojects.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * dropout
 * @author 
 */
@Data
public class Dropout implements Serializable {
    /**
     * 退学编号
     */
    private Integer dropId;

    /**
     * 退学日期
     */
    private Date dropDate;

    /**
     * 退学理由
     */
    private String dropReason;

    /**
     * 退费状态
     */
    private Integer ispay;

    /**
     * 退学办理人
     */
    private String dropHandler;

    /**
     * 教务部是否审批
     */
    private Integer jwApproval;

    /**
     * 教务部审核人
     */
    private String jwAppname;

    /**
     * 教务部审批时间
     */
    private Date jwApptime;

    /**
     * 教务部撤销审批人
     */
    private String jwDropnameapp;

    /**
     * 教务部撤销审批时间
     */
    private Date jwDroptimeapp;

    /**
     * 增加日期
     */
    private Date addtime;

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
     * 学员编号
     */
    private Integer studentId;

    /**
     * 课程编号
     */
    private Integer courseId;

    /**
     * 课程详细编号
     */
    private Integer coursedetailsId;

    /**
     * 班级编号
     */
    private Integer classesId;

    private static final long serialVersionUID = 1L;
}