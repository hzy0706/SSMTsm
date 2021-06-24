package com.trkj.trainingprojects.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * shift
 * @author 
 */
@Data
public class Shift implements Serializable {
    /**
     * 转班编号
     */
    private Integer shiftId;

    /**
     * 转班日期
     */
    private Date shiftDate;

    /**
     * 转班理由
     */
    private String shiftReason;

    /**
     * 转班办理人
     */
    private String shiftHandler;

    /**
     * 操作审批
     */
    private Integer approval;

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
     * 学员分班编号
     */
    private Integer studentstatusId;

    /**
     * 原班级编号
     */
    private Integer classesId;

    /**
     * 新班级编号
     */
    private Integer classesId2;

    private static final long serialVersionUID = 1L;
}