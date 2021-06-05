package com.trkj.trainingprojects.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 成绩表(ExaminationScore)实体类
 *
 * @author makejava
 * @since 2021-06-03 15:18:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExaminationScore implements Serializable {
    /**
     * 成绩表编号
     */
    private Integer examinationscoreId;
    /**
     * 分数
     */
    private Object score;
    /**
     * 考试状态
     */
    private Integer examinationstatus;
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
     * 考试总表编号
     */
    private Integer examinationId;

    private List<Student> students;
    private Examination examination;
    private static final long serialVersionUID = 1L;
}
