package com.trkj.trainingprojects.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 试卷表(ExamManage)实体类
 *
 * @author makejava
 * @since 2021-06-24 19:01:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "session,semester,classes,courseDetails")
public class ExamManage implements Serializable {
    /**
     * 考试编号
     */
    private Integer examcode;
    /**
     * 考试名称
     */
    private String examinationname;
    /**
     * 该次考试介绍
     */
    private String description;
    /**
     * 试卷编号
     */
    private Integer paperid;
    /**
     * 考试日期
     */
    private String examdate;
    /**
     * 持续时长
     */
    private Integer totaltime;
    /**
     * 总分
     */
    private Integer totalscore;
    /**
     * 考试类型
     */
    private String studenttype;
    /**
     * 考生须知
     */
    private String tips;
    /**
     * 年届编号
     */
    private Integer sessionId;
    /**
     * 学期编号
     */
    private Integer semesterId;
    /**
     * 班级编号
     */
    private Integer classesId;
    /**
     * 课程详细编号
     */
    private Integer coursedetailsId;

    private Session session;
    private Semester semester;
    private Classes classes;
    private CourseDetails courseDetails;
    private static final long serialVersionUID = 1L;
}
