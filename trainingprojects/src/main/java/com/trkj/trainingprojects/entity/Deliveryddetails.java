package com.trkj.trainingprojects.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * deliveryddetails
 * @author 
 */
@Data
public class Deliveryddetails implements Serializable {
    /**
     * 教材出库详情表编号
     */
    private Integer deliveryddetailsId;

    /**
     * 出库数量
     */
    private Integer deliverycount;

    /**
     * 应收金额
     */
    private BigDecimal receivablemoney;

    /**
     * 教材编号
     */
    private Integer bookId;

    /**
     * 学员编号
     */
    private Integer studentId;

    /**
     * 教材出库总表编号
     */
    private Integer bookdeliveryId;

    private static final long serialVersionUID = 1L;
}