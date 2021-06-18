package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
@ClassMeta(className = "退学表")
public class DropoutVo {
    /**
     * 退学编号
     */
    private Integer dropId;

    /**
     * 退学日期
     */
    private Date dropDate;

    /**
     * 退学理由
     */
    private String dropReason;

    /**
     * 退费状态
     */
    private Integer ispay;

    /**
     * 退学办理人
     */
    public String dropHandler;

    /**
     * 教务部是否审批
     */
    private Integer jwApproval;

    /**
     * 教务部审核人
     */
    public String jwAppname;

    /**
     * 教务部审批时间
     */
    private Date jwApptime;

    /**
     * 教务部撤销审批人
     */
    public String jwDropnameapp;

    /**
     * 教务部撤销审批时间
     */
    private Date jwDroptimeapp;

    /**
     * 增加日期
     */
    private Date addtime;

    /**
     * 删除人
     */
    public String deletename;

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

    private static final long serialVersionUID = 1L;
}
