package com.trkj.trainingprojects.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 班级表(Classes)实体类
 *
 * @author makejava
 * @since 2021-06-02 12:42:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "emp,courseList,courseDetailsList")
public class Classes implements Serializable {
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
    private Date starteddate;
    /**
     * 培训计划结束日期
     */
    private Date enddate;
    /**
     * 培训最终结束日期
     */
    private Date lastdate;
    /**
     * 一周几节课
     */
    private Integer manylessons;
    /**
     * 新增人员
     */
    private String addname;
    /**
     * 新增时间
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

    private Emp emp;
    private List<Course> courseList;
    private List<CourseDetails> courseDetailsList;

    private static final long serialVersionUID = 1L;
}
