package com.trkj.trainingprojects.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 单位类型表(Unittype)实体类
 *
 * @author makejava
 * @since 2021-06-21 10:32:38
 */
public class Unittype implements Serializable {
    private static final long serialVersionUID = -34689786521005002L;
    /**
    * 单位类型编号
    */
    private Integer unittypeId;
    /**
    * 单位类型名称
    */
    private String unittypeName;
    /**
    * 增加人
    */
    private String addname;
    /**
    * 增加时间
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
    * 时效性
    */
    private Integer timeliness;


    public Integer getUnittypeId() {
        return unittypeId;
    }

    public void setUnittypeId(Integer unittypeId) {
        this.unittypeId = unittypeId;
    }

    public String getUnittypeName() {
        return unittypeName;
    }

    public void setUnittypeName(String unittypeName) {
        this.unittypeName = unittypeName;
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