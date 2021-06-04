package com.trkj.trainingprojects.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * daillogreply
 * @author 
 */
@Data
public class Daillogreply implements Serializable {
    /**
     * 日程评论编号
     */
    private Integer daillogreplyId;

    /**
     * 评论人
     */
    private String repliername;

    /**
     * 评论时间
     */
    private Date repliertime;

    /**
     * 评论内容
     */
    private String repliercontent;

    /**
     * 日志编号
     */
    private Integer daillogId;

    private static final long serialVersionUID = 1L;
}