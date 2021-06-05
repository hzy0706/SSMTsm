package com.trkj.trainingprojects.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 在读生访谈表(Interview)实体类
 *
 * @author makejava
 * @since 2021-06-04 11:33:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "classes,emp,student")
public class Interview implements Serializable {
    /**
     * 访谈编号
     */
    private Integer interviewId;
    /**
     * 访谈内容
     */
    private String interviewcontent;
    /**
     * 访谈日期
     */
    private Date interviewdate;
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
     * 访谈人编号
     */
    private Integer empId;
    /**
     * 学员编号
     */
    private Integer studentId;

    private Classes classes;
    private Emp emp;
    private Student student;
    private static final long serialVersionUID = 1L;
}
