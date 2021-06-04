package com.trkj.trainingprojects.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 学期表(Semester)实体类
 *
 * @author makejava
 * @since 2021-06-02 16:24:12
 */
public class Semester implements Serializable {
    private static final long serialVersionUID = -89672233692078935L;
    /**
    * 学期编号
    */
    private Integer semesterId;
    /**
    * 学期名称
    */
    private String semesterName;
    /**
    * 增加人
    */
    private String addname;
    /**
    * 增加时间
    */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date addtime;
    /**
    * 最后修改人
    */
    private String updatename;
    /**
    * 最后修改时间
    */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatetime;
    /**
    * 删除人
    */
    private String deletename;
    /**
    * 删除时间
    */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date deletetime;
    /**
    * 时效性
    */
    private Integer timeliness;


    public Integer getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(Integer semesterId) {
        this.semesterId = semesterId;
    }

    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
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

    public Integer getTimeliness() {
        return timeliness;
    }

    public void setTimeliness(Integer timeliness) {
        this.timeliness = timeliness;
    }

}