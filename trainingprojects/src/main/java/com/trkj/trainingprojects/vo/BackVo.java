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
@ClassMeta(className = "复课表")
@ToString(exclude = "studentVo,suspendeVo,courseVo,courseDetailsVo,classesVo")
public class BackVo {
    private Integer backId;

    /**
     * 班级已上课时
     */
    private Integer classalreadyon;

    /**
     * 缺课节数
     */
    private Integer absent;

    /**
     * 复课日期
     */
    private Date backTime;

    /**
     * 退费状态
     */
    private Integer ispay;

    /**
     * 复课意向
     */
    private Integer intention;

    /**
     * 复课办理人
     */
    private String backHandler;

    /**
     * 复课审批
     */
    private Integer backapproval;

    /**
     * 复课审批人
     */
    private String backappname;

    /**
     * 复课审批时间
     */
    private Date backapptime;

    /**
     * 撤销复课审批人
     */
    private String revokeappname;

    /**
     * 撤销复课审批时间
     */
    private Date revokeapptime;

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
    private StudentVo studentVo;

    /**
     * 停课编号
     */
    private Integer suspendeId;
    private SuspendeVo suspendeVo;

    /**
     * 课程编号
     */
    private Integer courseId;
    private CourseVo courseVo;

    /**
     * 课程详细编号
     */
    private Integer coursedetailsId;
    private CourseDetailsVo courseDetailsVo;

    /**
     * 班级编号
     */
    private Integer classesId;
    private ClassesVo classesVo;

    private static final long serialVersionUID = 1L;
}
