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
@ClassMeta(className = "学员访谈表")
@ToString(exclude = "classesVo,empVo,studentVo")
public class InterviewVo {
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
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date interviewdate;
    /**
     * 增加人
     */
    public String addname;
    /**
     * 增加时间
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

    private ClassesVo classesVo;
    private EmpVo empVo;
    private StudentVo studentVo;
    private static final long serialVersionUID = 1L;
}
