package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Date;

/**
 * 单位表(Unit)实体类
 *
 * @author makejava
 * @since 2021-06-03 16:30:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
@ClassMeta(className = "单位表")
public class UnitVo implements Serializable {
    private static final long serialVersionUID = 716394578968926959L;
    /**
    * 单位编号
    */
    private Integer unitId;
    /**
    * 单位名称
    */
    private String unitName;
    /**
    * 单位级别
    */
    private String unitLevel;
    /**
    * 负责人
    */
    private String director;
    /**
    * 单位地址
    */
    private String unitAddress;
    /**
    * 邮政编码
    */
    private String mailcode;
    /**
    * 单位电话
    */
    private String unitPhone;
    /**
    * 电子邮件
    */
    private String email;
    /**
    * 简介
    */
    private String profile;
    /**
    * 备注
    */
    private String remarks;
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
    /**
    * 单位类型
    */
    private Integer unittypeId;
    private String  UnitTypeName;

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitLevel() {
        return unitLevel;
    }

    public void setUnitLevel(String unitLevel) {
        this.unitLevel = unitLevel;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getUnitAddress() {
        return unitAddress;
    }

    public void setUnitAddress(String unitAddress) {
        this.unitAddress = unitAddress;
    }

    public String getMailcode() {
        return mailcode;
    }

    public void setMailcode(String mailcode) {
        this.mailcode = mailcode;
    }

    public String getUnitPhone() {
        return unitPhone;
    }

    public void setUnitPhone(String unitPhone) {
        this.unitPhone = unitPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public Integer getUnittypeId() {
        return unittypeId;
    }

    public void setUnittypeId(Integer unittypeId) {
        this.unittypeId = unittypeId;
    }

}