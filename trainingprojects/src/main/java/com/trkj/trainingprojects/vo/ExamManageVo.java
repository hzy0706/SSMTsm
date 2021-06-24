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
@ClassMeta(className = "试卷表")
@ToString(exclude = "sessionVo,semesterVo,classesVo,courseDetailsVo")
public class ExamManageVo {
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

    private SessionVo sessionVo;
    private SemesterVo semesterVo;
    private ClassesVo classesVo;
    private CourseDetailsVo courseDetailsVo;
    private static final long serialVersionUID = 1L;
}
