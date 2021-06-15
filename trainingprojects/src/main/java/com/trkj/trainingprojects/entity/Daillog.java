package com.trkj.trainingprojects.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * daillog
 * @author 
 */
@Data
public class Daillog implements Serializable {
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
    private Date planbegintime;

    /**
     * 计划结束日期
     */
    private Date planendtime;

    /**
     * 正式开始日期
     */
    private Date begintime;


    /**
     * 正式结束日期
     */
    private Date endtime;

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
    private String addname;

    /**
     * 新增时间
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
     * 职员编号
     */
    private Integer empId;

    private static final long serialVersionUID = 1L;
}