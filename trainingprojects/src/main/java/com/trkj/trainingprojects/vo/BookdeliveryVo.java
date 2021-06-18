package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ClassMeta(className = "教材出库总表")
@Validated
public class BookdeliveryVo {
    /**
     * 教材出库总表编号
     */
    private Integer bookdeliveryId;

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
     * 审批
     */
    private Integer approval;

    /**
     * 财务审批
     */
    private Integer cwapproval;

    /**
     * 审批人
     */
    public String appname;

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
    public String addname;

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
     * 职工编号
     */
    private Integer empId;
    private EmpVo empVo;

    private static final long serialVersionUID = 1L;
}
