package com.trkj.trainingprojects.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 奖项表(Awards)实体类
 *
 * @author makejava
 * @since 2021-06-04 10:50:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "studentList,classesList")
public class Awards implements Serializable {
    /**
     * 奖项编号
     */
    private Integer awardsId;
    /**
     * 获奖内容
     */
    private String awardscontent;
    /**
     * 获奖日期
     */
    private Date awardsdate;
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

    private List<Student> studentList;
    private List<Classes> classesList;
    private static final long serialVersionUID = 1L;
}
