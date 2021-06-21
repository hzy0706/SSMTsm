package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.util.Date;
@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
@ClassMeta(className = "退费表")
@ToString(exclude = "classesVo,backVo,suspendeVo,dropoutVo,courseVo,courseDetailsVo")
public class RefundVo {
    /**
     * 退费编号
     */
    private Integer refundId;

    /**
     * 退费类型
     */
    private String refundtype;

    /**
     * 退费金额
     */
    private BigDecimal dropMoney;

    /**
     * 退费金额审批
     */
    private Integer cwApproval;

    /**
     * 审核时间
     */
    private Date cwApptime;

    /**
     * 审核人
     */
    private String cwAppname;

    /**
     * 撤销审核时间
     */
    private Date cwDropapptime;

    /**
     * 撤销审核人
     */
    private String cwDropappname;

    /**
     * 退费办理人
     */
    private String addname;

    /**
     * 退费办理时间
     */
    private Date addtime;

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
    private ClassesVo classesVo;

    /**
     * 复课编号
     */
    private Integer backId;
    private BackVo backVo;


    /**
     * 停课编号
     */
    private Integer suspendeId;
    private SuspendeVo suspendeVo;


    /**
     * 退学编号
     */
    private Integer dropId;
    private DropoutVo dropoutVo;
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

    private static final long serialVersionUID = 1L;
}
