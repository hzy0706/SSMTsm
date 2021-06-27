package com.trkj.trainingprojects.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * loginjournal
 * @author 
 */
@Data
public class Loginjournal implements Serializable {
    /**
     * 登录日志编号
     */
    private Integer loginjournalId;

    /**
     * 登录时间
     */
    private Date logintime;

    /**
     * 职工编号
     */
    private Integer empId;

    private static final long serialVersionUID = 1L;
}