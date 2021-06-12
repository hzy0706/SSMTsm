package com.trkj.trainingprojects.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ideas
 * @author 
 */
@Data
public class Ideas implements Serializable {
    /**
     * 意见编号
     */
    private Integer ideasId;

    /**
     * 意见标题
     */
    private String ideasTitle;

    /**
     * 意见内容
     */
    private String ideasContent;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 发布意见人
     */
    private String ename;

    /**
     * 回复人
     */
    private String reply;

    /**
     * 回复时间
     */
    private Date revoverytime;

    /**
     * 回复内容
     */
    private String revoverycontent;

    /**
     * 发表时间
     */
    private Date timeofpublication;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date gettimeofpublication(){
        return timeofpublication;
    }

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
     * 意见箱编号
     */
    private Integer suggestId;

    /**
     * 发表意见人编号
     */
    private Integer empId;

    private static final long serialVersionUID = 1L;
}