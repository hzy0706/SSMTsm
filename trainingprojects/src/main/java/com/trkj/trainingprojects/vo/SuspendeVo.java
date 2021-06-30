package com.trkj.trainingprojects.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
@ClassMeta(className = "停课表")
@ToString(exclude = "studentVo,courseVo,courseDetailsVo,classesVo")
public class SuspendeVo {
    private Integer suspendeId;

    /**
     * 已上课时
     */
    private String alreadyon;

    /**
     * 停课日期
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date suspendeTime;

    /**
     * 停课理由
     */
    private String suspendeReason;

    /**
     * 停课办理人
     */
    public String addname;

    /**
     * 停课审批
     */
    private Integer suspendeapproval;

    /**
     * 停课审批人
     */
    public String appname;

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
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date updatetime;

    /**
     * 删除人
     */
    private String deletename;

    /**
     * 删除时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date deletetime;

    /**
     * 时效性
     */
    private Integer timeliness;

    /**
     * 学员编号
     */
    private Integer studentId;
    private StudentVo studentVo;

    /**
     * 课程编号
     */
    private Integer courseId;
    private CourseVo courseVo;

    /**
     * 课程详细编号
     */
    private Integer coursedetailsId;
    private CourseDetailsVo courseDetailsVo;
    /**
     * 班级编号
     */
    private Integer classesId;
    private ClassesVo classesVo;

    /**
     * 学员分班编号
     */
    private Integer studentstatusId;
    private StudentstatusVo studentstatusVo;

    private static final long serialVersionUID = 1L;
}
