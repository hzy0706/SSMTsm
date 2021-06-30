package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Date;

/**
 * 制度允许查看表(Systemselect)实体类
 *
 * @author makejava
 * @since 2021-06-30 23:14:21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
@ClassMeta(className = "制度允许查看表")
public class SystemselectVo implements Serializable {
    private static final long serialVersionUID = -93266007274734650L;
    /**
    * 制度允许查看编号
    */
    private Integer systemselectId;
    /**
    * 阅读状态
    */
    private Integer readstate;
    /**
    * 阅读时间
    */
    private Date readtime;
    /**
    * 制度编号
    */
    private Integer systemId;
    private SystemVo systemVo;
    /**
    * 允许查看用户编号
    */
    private Integer empId;


    public Integer getSystemselectId() {
        return systemselectId;
    }

    public void setSystemselectId(Integer systemselectId) {
        this.systemselectId = systemselectId;
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

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

}