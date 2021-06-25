package com.trkj.trainingprojects.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 其他开销表(Other)实体类
 *
 * @author makejava
 * @since 2021-06-24 14:09:08
 */
public class Other implements Serializable {
    private static final long serialVersionUID = 983525057420937514L;
    /**
    * 其他开销编号
    */
    private Integer otherId;
    /**
    * 支出名称
    */
    private String otherName;
    /**
    * 支出用途
    */
    private String otherPurpose;
    /**
    * 支出时间
    */
    private String otherTime;
    /**
    * 支出金额
    */
    private Double otherMoney;
    /**
    * 支出方式
    */
    private String otherMode;
    /**
    * 备注
    */
    private String otherRemarks;
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
    * 缴费状态
    */
    private Integer feesState;
    /**
    * 财务部审核时间
    */
    private Date approvaltime;
    /**
    * 财务部审核人
    */
    private String approvalname;
    /**
    * 财务部撤销审核时间
    */
    private Date revokeapptime;
    /**
    * 财务部撤销审核人
    */
    private String revokeappname;
    /**
    * 单位编号
    */
    private Integer unitId;


    public Integer getOtherId() {
        return otherId;
    }

    public void setOtherId(Integer otherId) {
        this.otherId = otherId;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getOtherPurpose() {
        return otherPurpose;
    }

    public void setOtherPurpose(String otherPurpose) {
        this.otherPurpose = otherPurpose;
    }

    public String getOtherTime() {
        return otherTime;
    }

    public void setOtherTime(String otherTime) {
        this.otherTime = otherTime;
    }

    public Double getOtherMoney() {
        return otherMoney;
    }

    public void setOtherMoney(Double otherMoney) {
        this.otherMoney = otherMoney;
    }

    public String getOtherMode() {
        return otherMode;
    }

    public void setOtherMode(String otherMode) {
        this.otherMode = otherMode;
    }

    public String getOtherRemarks() {
        return otherRemarks;
    }

    public void setOtherRemarks(String otherRemarks) {
        this.otherRemarks = otherRemarks;
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

    public Integer getFeesState() {
        return feesState;
    }

    public void setFeesState(Integer feesState) {
        this.feesState = feesState;
    }

    public Date getApprovaltime() {
        return approvaltime;
    }

    public void setApprovaltime(Date approvaltime) {
        this.approvaltime = approvaltime;
    }

    public String getApprovalname() {
        return approvalname;
    }

    public void setApprovalname(String approvalname) {
        this.approvalname = approvalname;
    }

    public Date getRevokeapptime() {
        return revokeapptime;
    }

    public void setRevokeapptime(Date revokeapptime) {
        this.revokeapptime = revokeapptime;
    }

    public String getRevokeappname() {
        return revokeappname;
    }

    public void setRevokeappname(String revokeappname) {
        this.revokeappname = revokeappname;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

}