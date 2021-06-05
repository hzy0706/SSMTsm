package com.trkj.trainingprojects.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 考试总表(Examination)实体类
 *
 * @author makejava
 * @since 2021-06-03 14:31:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "classes,emps,courses")
public class Examination implements Serializable {
    /**
     * 考试总表编号
     */
    private Integer examinationId;
    /**
     * 考试名称
     */
    private String examinationname;
    /**
     * 平均分
     */
    private Object average;
    /**
     * 最高分
     */
    private Object highestscore;
    /**
     * 最低分
     */
    private Object lowestscore;
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
     * 班级编号
     */
    private Integer classesId;
    /**
     * 教师编号
     */
    private Integer teacherId;
    /**
     * 课程编号
     */
    private Integer courseId;

    private Classes classes;
    private Emp emps;
    private Course courses;
    private static final long serialVersionUID = 1L;
}
