package com.trkj.trainingprojects.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * mail
 * @author 
 */
@Data
public class Mail implements Serializable {
    /**
     * 邮件编号
     */
    private Integer mailId;

    /**
     * 邮件标题
     */
    private String mailTitle;

    /**
     * 发送时间
     */
    private Date sendtime;

    /**
     * 邮件内容
     */
    private String mailContent;

    /**
     * 删除人
     */
    private String deletename;

    /**
     * 删除时间
     */
    private Date deletetime;

    /**
     * 是否草稿
     */
    private Integer isdraft;

    /**
     * 时效性
     */
    private Integer timeliness;

    /**
     * 职工编号
     */
    private Integer empId;

    private static final long serialVersionUID = 1L;
}