package com.trkj.trainingprojects.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * mailenclosure
 * @author 
 */
@Data
public class Mailenclosure implements Serializable {
    /**
     * 邮件附件编号
     */
    private Integer mailenclosureId;

    /**
     * 邮件附件
     */
    private String enclosure;

    /**
     * 邮件编号
     */
    private Integer mailId;

    private static final long serialVersionUID = 1L;
}