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
@Validated
@ClassMeta(className = "教材入库表")
public class BookstorageVo {
    /**
     * 教材入库编号
     */
    private Integer bookstorageId;

    /**
     * 入库数量
     */
    private Integer storagecount;

    /**
     * 总价格
     */
    private BigDecimal totalprice;

    /**
     * 入库时间
     */
    private Date storagetime;

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
     * 增加人
     */
    public String addname;

    /**
     * 最后修改人
     */
    public String updatename;

    /**
     * 最后修改时间
     */
    private Date updatetime;

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
     * 教材编号
     */
    private Integer bookId;
    private BookVo bookVo;

    /**
     * 职工编号
     */
    private Integer empId;
    private EmpVo empVo;

    private static final long serialVersionUID = 1L;
}
