package com.trkj.trainingprojects.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * 报班缴费表(Entryfees)实体类
 *
 * @author makejava
 * @since 2021-06-18 21:53:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "register,student,course")
public class Entryfees implements Serializable {
    /**
     * 缴费编号
     */
    private Integer feesId;
    /**
     * 缴费单据号
     */
    private String feesNumber;
    /**
     * 应收金额
     */
    private Double feesReceivable;
    /**
     * 缴费方式
     */
    private String feesType;
    /**
     * 预缴金额
     */
    private Double feesAdvance;
    /**
     * 累计欠费金额
     */
    private Double accumulated;
    /**
     * 实收金额
     */
    private Double receipts;
    /**
     * 最后修改人
     */
    private String updatename;
    /**
     * 最后修改时间
     */
    private Date updatetime;
    /**
     * 增加人
     */
    private String addname;
    /**
     * 增加时间
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
     * 缴费状态
     */
    private Integer feesState;
    /**
     * 财务部审核时间
     */
    private Date approvaltime;
    /**
     * 财务部审核人
     */
    private String approvalname;
    /**
     * 财务部撤销审核时间
     */
    private Date revokeapptime;
    /**
     * 财务部撤销审核人
     */
    private String revokeappname;
    /**
     * 咨询登记编号
     */
    private Integer registerId;
    /**
     * 学员编号
     */
    private Integer studentId;
    /**
     * 课程编号
     */
    private Integer courseId;

    private Register register;
    private Student student;
    private Course course;
    private static final long serialVersionUID = 1L;
}
