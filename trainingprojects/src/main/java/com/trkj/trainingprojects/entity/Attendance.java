package com.trkj.trainingprojects.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * 学员考勤表(Attendance)实体类
 *
 * @author makejava
 * @since 2021-06-25 14:30:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "student,emp")
public class Attendance implements Serializable {
    /**
     * 考勤表编号
     */
    private Integer attendanceId;
    /**
     * 考勤时间
     */
    private Date attendanceTime;
    /**
     * 考勤状态
     */
    private Integer status;
    /**
     * 备注
     */
    private String remarks;
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
     * 职工编号
     */
    private Integer empId;

    private Student student;
    private Emp emp;
    private static final long serialVersionUID = 1L;
}
