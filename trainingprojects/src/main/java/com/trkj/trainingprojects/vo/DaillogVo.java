package com.trkj.trainingprojects.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@ClassMeta(className = "日程表")
public class DaillogVo {
    /**
     * 日程编号
     */
    private Integer daillogId;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     *日程类型
     */
    private String daillogType;

    /**
     * 计划开始日期
     */
//    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date planbegintime;
    public Date getPlanbegintime(){
        return planbegintime;
    }


    /**
     * 计划结束日期
     */
//    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date planendtime;
    public Date getPlanendtime(){
        return planendtime;
    }

    /**
     * 进行状态
     */
    private int conductType;

    /**
     * 正式开始日期
     */
//    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date begintime;
    public Date getbegintime(){
        return begintime;
    }

    /**
     * 正式结束日期
     */
//    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date endtime;
    public Date getendtime(){
        return endtime;
    }

    /**
     * 进度状态
     */
    private Integer state;

    /**
     * 延期理由
     */
    private String postponement;

    /**
     * 新增人员
     */
    public String addname;

    /**
     * 新增时间
     */
//    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date addtime;
    public Date getAddtime(){
        return addtime;
    }


    /**
     * 最后修改人
     */
    public String updatename;

    /**
     * 最后修改时间
     */
//    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updatetime;

    /**
     * 删除人
     */
    public String deletename;

    /**
     * 删除时间
     */
//    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date deletetime;

    /**
     * 时效性
     */
    private Integer timeliness;

    /**
     * 职员编号
     */
    private Integer empId;
    @JsonIgnore
    private EmpVo empVo;

    private static final long serialVersionUID = 1L;
}
