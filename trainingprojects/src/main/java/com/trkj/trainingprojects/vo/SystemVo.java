package com.trkj.trainingprojects.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Date;

/**
 * 规章制度表(System)实体类
 *
 * @author makejava
 * @since 2021-06-30 23:12:04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
@ClassMeta(className = "规章制度表")
public class SystemVo implements Serializable {
    private static final long serialVersionUID = -34515620864332829L;
    /**
    * 制度编号
    */
    private Integer systemId;
    /**
    * 制度主题
    */
    private String systemTheme;
    /**
    * 制度内容
    */
    private String systemContent;
    /**
    * 制度状态
    */
    private Integer systemState;
    /**
    * 录入人员
    */
    public String addname;
    /**
    * 录入时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date addtime;
    /**
    * 最后修改人
    */
    public String updatename;
    /**
    * 最后修改时间
    */
    private Date updatetime;
    /**
    * 删除人
    */
    public String deletename;
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
    * 制度类型编号
    */
    private Integer systemtypeId;
    /**
    * 发文单位
    */
    private Integer deptId;


    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public String getSystemTheme() {
        return systemTheme;
    }

    public void setSystemTheme(String systemTheme) {
        this.systemTheme = systemTheme;
    }

    public String getSystemContent() {
        return systemContent;
    }

    public void setSystemContent(String systemContent) {
        this.systemContent = systemContent;
    }

    public Integer getSystemState() {
        return systemState;
    }

    public void setSystemState(Integer systemState) {
        this.systemState = systemState;
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

    public Integer getSystemtypeId() {
        return systemtypeId;
    }

    public void setSystemtypeId(Integer systemtypeId) {
        this.systemtypeId = systemtypeId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

}