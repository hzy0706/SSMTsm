package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Validated
@AllArgsConstructor
@NoArgsConstructor
@Data
@ClassMeta(className = "学员分班表")
@ToString(exclude = "studentVo,classesVo")
public class StudentstatusVo {
    /**
     * 学员分班表编号
     */
    private Integer studentstatusId;
    /**
     * 学员状态
     */
    private Integer status;
    /**
     * 报班类型
     */
    private String allottype;
    /**
     * 是否审批
     */
    private Integer approval;
    /**
     * 审批人员
     */
    private String appname;
    /**
     * 审批时间
     */
    private Date apptime;
    /**
     * 撤销审批人员
     */
    private String revokeappname;
    /**
     * RevokeAppTime
     */
    private Date revokeapptime;
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
     * 班级编号
     */
    private Integer classesId;
    /**
     * 课程编号
     */
    private Integer courseId;

    private CourseVo courseVo;
    private StudentVo studentVo;
    private ClassesVo classesVo;
    private static final long serialVersionUID = 1L;
}
