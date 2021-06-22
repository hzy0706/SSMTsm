package com.trkj.trainingprojects.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * 学员分班表(Studentstatus)实体类
 *
 * @author makejava
 * @since 2021-06-17 16:44:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "student,classes")
public class Studentstatus implements Serializable {
    /**
     * 学员分班表编号
     */
    private Integer studentstatusId;
    /**
     * 学员状态
     */
    private Integer status;
    /**
     * 报班类型
     */
    private String allottype;
    /**
     * 是否审批
     */
    private Integer approval;
    /**
     * 审批人员
     */
    private String appname;
    /**
     * 审批时间
     */
    private Date apptime;
    /**
     * 撤销审批人员
     */
    private String revokeappname;
    /**
     * RevokeAppTime
     */
    private Date revokeapptime;
    /**
     * 增加人
     */
    private String addname;
    /**
     * 增加日期
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
     * 学员编号
     */
    private Integer studentId;
    /**
     * 班级编号
     */
    private Integer classesId;
    /**
     * 备注
     */
    public String remarks;

    private Student student;
    private Classes classes;
    private static final long serialVersionUID = 1L;
}
