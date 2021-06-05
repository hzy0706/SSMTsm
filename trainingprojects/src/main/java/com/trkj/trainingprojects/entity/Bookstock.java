package com.trkj.trainingprojects.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * bookstock
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bookstock implements Serializable {
    /**
     * 出库收支编号
     */
    private Integer stockId;

    /**
     * 单据号
     */
    private String stockNumber;

    /**
     * 收支日期
     */
    private Date stockDate;

    /**
     * 收支明细
     */
    private String refundDetails;

    /**
     * 收支金额
     */
    private BigDecimal totalmoney;

    /**
     * 后勤部经办人
     */
    private String addname;

    /**
     * 经办时间
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
     * 财务是否审核
     */
    private Integer checkedby;

    /**
     * 财务部审核时间
     */
    private Date appname;

    /**
     * 财务部审核人
     */
    private String apptime;

    /**
     * 财务部撤销审核时间
     */
    private Date revokeapptime;

    /**
     * 财务部撤销审核人
     */
    private String revokeappname;

    /**
     * 教材出库总编号
     */
    private Integer bookdeliveryId;

    private static final long serialVersionUID = 1L;
}