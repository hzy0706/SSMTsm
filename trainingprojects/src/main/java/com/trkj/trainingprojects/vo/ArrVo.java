package com.trkj.trainingprojects.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class ArrVo {
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

    private String stuName;

    private String bookname;

    private BigDecimal price;

    private BigDecimal total;

    private String addname;

    private Integer empId;
    private Integer count;


    private static final long serialVersionUID = 1L;
}
