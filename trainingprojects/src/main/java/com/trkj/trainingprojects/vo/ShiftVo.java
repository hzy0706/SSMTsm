package com.trkj.trainingprojects.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
@ClassMeta(className = "转班表")
public class ShiftVo {
    /**
     * 转班编号
     */
    private Integer shiftId;

    /**
     * 转班日期
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date shiftDate;

    /**
     * 转班理由
     */
    private String shiftReason;

    /**
     * 转班办理人
     */
    public String addname;

    /**
     * 操作审批
     */
    private Integer approval;

    /**
     * 教务部审核人
     */
    public String appname;

    /**
     * 教务部审批时间
     */
    private Date jwApptime;

    /**
     * 教务部撤销审批人
     */
    public String jwDropnameapp;

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
    public String deletename;

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
    private StudentVo studentVo;

    /**
     * 学员分班编号
     */
    private Integer studentstatusId;
    private StudentstatusVo studentstatusVo;


    /**
     * 原班级编号
     */
    private Integer classesId;
    private ClassesVo classesVo;

    /**
     * 新班级编号
     */
    private Integer classesId2;
    private ClassesVo classesVo2;

    public String updatename;

    private Date updatetime;


    private static final long serialVersionUID = 1L;
}
