package com.trkj.trainingprojects.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 课程表(Course)实体类
 *
 * @author makejava
 * @since 2021-06-01 13:56:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "classType,coursedetails,itemBanks")
public class Course implements Serializable {
    /**
     * 课程编号
     */
    private Integer courseId;
    /**
     * 课程名称
     */
    private String courseName;
    /**
     * 课程状态
     */
    private Integer courseState;
    /**
     * 课时量
     */
    private Integer classhours;
    /**
     * 课程费用
     */
    private Double courseMoney;
    /**
     * 招生部提成
     */
    private Double commission;
    /**
     * 增加人
     */
    private String addname;
    /**
     * 增加时间
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
     * 停报办理人
     */
    private String stopname;
    /**
     * 停报时间
     */
    private Date stoptime;
    /**
     * 开报办理人
     */
    private String beginname;
    /**
     * 开报时间
     */
    private Date begintime;
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
     * 课类编号
     */
    private Integer classtypeId;

    private ClassType classType;

    private List<CourseDetails> coursedetails;

    private List<ItemBank> itemBanks;
    private static final long serialVersionUID = 1L;
}
