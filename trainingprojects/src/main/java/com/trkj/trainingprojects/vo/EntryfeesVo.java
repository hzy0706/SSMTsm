package com.trkj.trainingprojects.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.trkj.trainingprojects.ann.ClassMeta;
import com.trkj.trainingprojects.entity.Course;
import com.trkj.trainingprojects.entity.Register;
import com.trkj.trainingprojects.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
@ClassMeta(className = "报班缴费表")
@ToString(exclude = "registerVo,studentVo,courseVo")
public class EntryfeesVo {
    /**
     * 缴费编号
     */
    private Integer feesId;
    /**
     * 缴费单据号
     */
    private String feesNumber;
    /**
     * 应收金额
     */
    private Double feesReceivable;
    /**
     * 缴费方式
     */
    private String feesType;
    /**
     * 预缴金额
     */
    private Double feesAdvance;
    /**
     * 累计欠费金额
     */
    private Double accumulated;
    /**
     * 实收金额
     */
    private Double receipts;
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
    private Integer feesState;
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
     * 课程编号
     */
    private Integer courseId;

    private RegisterVo registerVo;
    private StudentVo studentVo;
    private CourseVo courseVo;
    private static final long serialVersionUID = 1L;
}
