package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Date;

/**
 * 其他开销表(Other)实体类
 *
 * @author makejava
 * @since 2021-06-24 14:09:08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
@ClassMeta(className = "其他开销表")
public class OtherVo implements Serializable {
    private static final long serialVersionUID = 983525057420937514L;
    /**
    * 其他开销编号
    */
    private Integer otherId;
    /**
    * 支出名称
    */
    private String otherName;
    /**
    * 支出用途
    */
    private String otherPurpose;
    /**
    * 支出时间
    */
    private String otherTime;
    /**
    * 支出金额
    */
    private Double otherMoney;
    /**
    * 支出方式
    */
    private String otherMode;
    /**
    * 备注
    */
    private String otherRemarks;
    /**
    * 增加人
    */
    public String addname;
    /**
    * 增加时间
    */
    private Date addtime;
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
    * 单位编号
    */
    private Integer unitId;
    private String unitName;
}