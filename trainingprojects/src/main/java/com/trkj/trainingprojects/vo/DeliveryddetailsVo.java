package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
@ClassMeta(className = "教材出库详情表")
public class DeliveryddetailsVo {
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
    private BookVo bookVo;

    /**
     * 学员编号
     */
    private Integer studentId;
    private StudentVo studentVo;

    /**
     * 教材出库总表编号
     */
    private Integer bookdeliveryId;
    private BookdeliveryVo bookdeliveryVo;

    private static final long serialVersionUID = 1L;
}
