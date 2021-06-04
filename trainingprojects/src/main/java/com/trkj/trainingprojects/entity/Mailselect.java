package com.trkj.trainingprojects.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * mailselect
 * @author 
 */
@Data
public class Mailselect implements Serializable {
    /**
     * 邮件允许查看编号
     */
    private Integer mailselectId;

    /**
     * 阅读时间
     */
    private Date readtime;

    /**
     * 阅读状态
     */
    private Integer readstate;

    /**
     * 邮件编号
     */
    private Integer mailId;

    /**
     * 允许查看用户编号
     */
    private Integer empId;

    private static final long serialVersionUID = 1L;
}