package com.trkj.trainingprojects.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.trkj.trainingprojects.ann.ClassMeta;
import com.trkj.trainingprojects.entity.Emp;
import com.trkj.trainingprojects.entity.Student;
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
@ClassMeta(className = "学员考勤表")
@ToString(exclude = "studentVo,empVo")
public class AttendanceVo {
    /**
     * 考勤表编号
     */
    private Integer attendanceId;
    /**
     * 考勤时间
     */
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
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
    public String addname;
    /**
     * 增加日期
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

    private StudentVo studentVo;
    private EmpVo empVo;
    private static final long serialVersionUID = 1L;
}
