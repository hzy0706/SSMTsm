package com.trkj.trainingprojects.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 公告表(Announcement)实体类
 *
 * @author makejava
 * @since 2021-06-29 20:08:27
 */
public class Announcement implements Serializable {
    private static final long serialVersionUID = 106484064380758527L;
    /**
    * 公告编号
    */
    private Integer announcementId;
    /**
    * 开始时间
    */
    private Date startTime;
    /**
    * 结束时间
    */
    private Date endTime;
    /**
    * 公告主题
    */
    private String announcementTheme;
    /**
    * 公告内容
    */
    private String announcementContent;
    /**
    * 公告状态
    */
    private Integer announcementState;
    /**
    * 录入人员
    */
    private String addname;
    /**
    * 录入时间
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
    * 最后发布人
    */
    private String publishnmae;
    /**
    * 最后发布时间
    */
    private Date publishtime;
    /**
    * 最后暂停人
    */
    private String suspendname;
    /**
    * 最后暂停时间
    */
    private Date suspendtime;
    /**
    * 时效性
    */
    private Integer timeliness;
    /**
    * 公告类型编号
    */
    private Integer announcementtypeId;


    public Integer getAnnouncementId() {
        return announcementId;
    }

    public void setAnnouncementId(Integer announcementId) {
        this.announcementId = announcementId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getAnnouncementTheme() {
        return announcementTheme;
    }

    public void setAnnouncementTheme(String announcementTheme) {
        this.announcementTheme = announcementTheme;
    }

    public String getAnnouncementContent() {
        return announcementContent;
    }

    public void setAnnouncementContent(String announcementContent) {
        this.announcementContent = announcementContent;
    }

    public Integer getAnnouncementState() {
        return announcementState;
    }

    public void setAnnouncementState(Integer announcementState) {
        this.announcementState = announcementState;
    }

    public String getAddname() {
        return addname;
    }

    public void setAddname(String addname) {
        this.addname = addname;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getUpdatename() {
        return updatename;
    }

    public void setUpdatename(String updatename) {
        this.updatename = updatename;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getDeletename() {
        return deletename;
    }

    public void setDeletename(String deletename) {
        this.deletename = deletename;
    }

    public Date getDeletetime() {
        return deletetime;
    }

    public void setDeletetime(Date deletetime) {
        this.deletetime = deletetime;
    }

    public String getPublishnmae() {
        return publishnmae;
    }

    public void setPublishnmae(String publishnmae) {
        this.publishnmae = publishnmae;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    public String getSuspendname() {
        return suspendname;
    }

    public void setSuspendname(String suspendname) {
        this.suspendname = suspendname;
    }

    public Date getSuspendtime() {
        return suspendtime;
    }

    public void setSuspendtime(Date suspendtime) {
        this.suspendtime = suspendtime;
    }

    public Integer getTimeliness() {
        return timeliness;
    }

    public void setTimeliness(Integer timeliness) {
        this.timeliness = timeliness;
    }

    public Integer getAnnouncementtypeId() {
        return announcementtypeId;
    }

    public void setAnnouncementtypeId(Integer announcementtypeId) {
        this.announcementtypeId = announcementtypeId;
    }

}