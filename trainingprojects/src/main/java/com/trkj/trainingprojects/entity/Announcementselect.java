package com.trkj.trainingprojects.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 公告允许查看表(Announcementselect)实体类
 *
 * @author makejava
 * @since 2021-06-30 15:24:36
 */
public class Announcementselect implements Serializable {
    private static final long serialVersionUID = 280312318515585601L;
    /**
    * 公告允许查看编号
    */
    private Integer announcementselectId;
    /**
    * 阅读状态
    */
    private Integer readstate;
    /**
    * 阅读时间
    */
    private Date readtime;
    /**
    * 公告编号
    */
    private Integer announcementId;
    /**
    * 允许查看用户编号
    */
    private Integer empId;


    public Integer getAnnouncementselectId() {
        return announcementselectId;
    }

    public void setAnnouncementselectId(Integer announcementselectId) {
        this.announcementselectId = announcementselectId;
    }

    public Integer getReadstate() {
        return readstate;
    }

    public void setReadstate(Integer readstate) {
        this.readstate = readstate;
    }

    public Date getReadtime() {
        return readtime;
    }

    public void setReadtime(Date readtime) {
        this.readtime = readtime;
    }

    public Integer getAnnouncementId() {
        return announcementId;
    }

    public void setAnnouncementId(Integer announcementId) {
        this.announcementId = announcementId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

}