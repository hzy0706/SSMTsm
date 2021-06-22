package com.trkj.trainingprojects.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * suspende
 * @author 
 */
@Data
public class Suspende implements Serializable {
    /**
     * 停课编号
     */
    private Integer suspendeId;

    /**
     * 已上课时
     */
    private String alreadyon;

    /**
     * 停课日期
     */
    private Date suspendeTime;

    /**
     * 停课理由
     */
    private String suspendeReason;

    /**
     * 停课办理人
     */
    private String suspendeHandler;

    /**
     * 停课审批
     */
    private Integer suspendeapproval;

    /**
     * 停课审批人
     */
    private String suspendeappname;

    /**
     * 停课审批时间
     */
    private Date suspendeapptime;

    /**
     * 撤销停课审批人
     */
    private String revokeappname;

    /**
     * 撤销停课审批时间
     */
    private Date revokeapptime;

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
     * 课程编号
     */
    private Integer courseId;

    /**
     * 课程详细编号
     */
    private Integer coursedetailsId;

    /**
     * 班级编号
     */
    private Integer classesId;

    private static final long serialVersionUID = 1L;
}