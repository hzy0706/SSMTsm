package com.trkj.trainingprojects.vo;

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
@ClassMeta(className = "考试总表")
@ToString(exclude = "classesListVos,empsVo,coursesVo")
public class ExaminationVo {
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

    private ClassesVo classesListVos;
    private EmpVo empsVo;
    private CourseVo coursesVo;
    private static final long serialVersionUID = 1L;
}
