package com.trkj.trainingprojects.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * opjournal
 * @author 
 */
@Data
public class Opjournal implements Serializable {
    /**
     * 操作日志编号
     */
    private Integer opjournalId;

    /**
     * 操作内容
     */
    private String opcontent;

    /**
     * 操作时间
     */
    private Date optime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getOptime() {
        return optime;
    }

    /**
     * 操作人姓名
     */
    private String empName;

    private static final long serialVersionUID = 1L;
}