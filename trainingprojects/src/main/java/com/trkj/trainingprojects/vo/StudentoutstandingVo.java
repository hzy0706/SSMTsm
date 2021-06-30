package com.trkj.trainingprojects.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.trkj.trainingprojects.ann.ClassMeta;
import com.trkj.trainingprojects.vo.EntryfeesVo;
import com.trkj.trainingprojects.vo.RegisterVo;
import com.trkj.trainingprojects.vo.StudentVo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
@ClassMeta(className = "欠费补缴表")
@ToString(exclude = "registerVo,studentVo,entryfeesVo")
public class StudentoutstandingVo {
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
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date outstandingDate;
    /**
     * 最后修改人
     */
    public String updatename;
    /**
     * 最后修改时间
     */
    private Date updatetime;
    /**
     * 增加人
     */
    public String addname;
    /**
     * 增加时间
     */
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date addtime;
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
    private Integer outstandingState;
    /**
     * 财务部审核时间
     */
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date approvaltime;
    /**
     * 财务部审核人
     */
    private String approvalname;
    /**
     * 财务部撤销审核时间
     */
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
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

    private RegisterVo registerVo;
    private StudentVo studentVo;
    private EntryfeesVo entryfeesVo;
    private static final long serialVersionUID = 1L;
}
