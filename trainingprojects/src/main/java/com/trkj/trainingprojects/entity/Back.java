package com.trkj.trainingprojects.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * back
 * @author 
 */
@Data
public class Back implements Serializable {
    /**
     * 复课编号
     */
    private Integer backId;

    /**
     * 班级已上课时
     */
    private Integer classalreadyon;

    /**
     * 缺课节数
     */
    private Integer absent;

    /**
     * 复课日期
     */
    private Date backTime;

    /**
     * 退费状态
     */
    private Integer ispay;

    /**
     * 复课意向
     */
    private Integer intention;

    /**
     * 复课办理人
     */
    private String backHandler;

    /**
     * 复课审批
     */
    private Integer backapproval;

    /**
     * 复课审批人
     */
    private String backappname;

    /**
     * 复课审批时间
     */
    private Date backapptime;

    /**
     * 撤销复课审批人
     */
    private String revokeappname;

    /**
     * 撤销复课审批时间
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
     * 停课编号
     */
    private Integer suspendeId;

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