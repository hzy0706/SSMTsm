package com.trkj.trainingprojects.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * 学员欠费补缴表(Studentoutstanding)实体类
 *
 * @author makejava
 * @since 2021-06-18 23:11:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "register,student,entryfees")
public class Studentoutstanding implements Serializable {
    /**
     * 补缴编号
     */
    private Integer outstandingId;
    /**
     * 补缴单据号
     */
    private String outstandingNumber;
    /**
     * 补缴金额
     */
    private Double alongmoney;
    /**
     * 补缴日期
     */
    private Date outstandingDate;
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
    private Integer outstandingState;
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
     * 报班缴费表
     */
    private Integer feesId;

    private Register register;
    private Student student;
    private Entryfees entryfees;
    private static final long serialVersionUID = 1L;
}
