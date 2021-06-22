package com.trkj.trainingprojects.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
@ClassMeta(className = "班级表")
@ToString(exclude = "empVo1,empVo2,courseList,courseDetailsList")
public class ClassesVo {
    /**
     * 班级编号
     */
    private Integer classesId;
    /**
     * 班级名称
     */
    private String classesName;
    /**
     * 班级状态
     */
    private Integer classesOpen;
    /**
     * 培训开始日期
     */
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date starteddate;
    /**
     * 培训计划结束日期
     */
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date enddate;
    /**
     * 培训最终结束日期
     */
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date lastdate;
    /**
     * 一周几节课
     */
    private Integer manylessons;
    /**
     * 新增人员
     */
    public String addname;
    /**
     * 新增时间
     */
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
     * 班级实际人数
     */
    public Integer classestudents;
    /**
     * 班级最大人数
     */
    public Integer classecountstudents;
    /**
     * 时效性
     */
    private Integer timeliness;
    /**
     * 课程编号
     */
    private Integer courseId;
    /**
     * 班主任编号
     */
    private Integer empId;
    /**
     * 教员编号
     */
    private Integer teacherId;
    /**
     * 课程详细编号
     */
    private Integer coursedetailsId;

    private EmpVo empVo1;
    private EmpVo empVo2;
    private CourseVo courseList;
    private CourseDetailsVo courseDetailsList;

    private static final long serialVersionUID = 1L;
}
