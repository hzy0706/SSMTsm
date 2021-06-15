package com.trkj.trainingprojects.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * classesdelivery
 * @author 
 */
@Data
public class Classesdelivery implements Serializable {
    /**
     * 教材出库总表编号（班级）
     */
    private Integer classesdeliveryId;

    /**
     * 出库销售编号
     */
    private String salenumber;

    /**
     * 总价格
     */
    private BigDecimal total;

    /**
     * 出库时间
     */
    private Date deliverytime;

    /**
     * 出库类型
     */
    private String deliverytype;

    /**
     * 出库数量
     */
    private Integer classesdeliveryCount;

    /**
     * 审批
     */
    private Integer approval;

    /**
     * 审批人
     */
    private String appname;

    /**
     * 审批时间
     */
    private Date apptime;

    /**
     * 撤销审批人
     */
    private String revokeAppname;

    /**
     * 撤销审批时间
     */
    private Date revokeApptime;

    /**
     * 新增人员
     */
    private String addname;

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
     * 职工编号
     */
    private Integer empId;

    /**
     * 职工编号
     */
    private Integer bookId;

    /**
     * 职工编号
     */
    private Integer classesId;

    private static final long serialVersionUID = 1L;
}