package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
@ClassMeta(className = "日程表")
public class DaillogVo {
    /**
     * 日程编号
     */
    private Integer daillogId;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 计划开始日期
     */
    private Date planbegintime;

    /**
     * 计划结束日期
     */
    private Date planendtime;

    /**
     * 正式开始日期
     */
    private Date begintime;

    /**
     * 正式结束日期
     */
    private Date endtime;

    /**
     * 进度状态
     */
    private Integer state;

    /**
     * 延期理由
     */
    private String postponement;

    /**
     * 新增人员
     */
    public String addname;

    /**
     * 新增时间
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
     * 职员编号
     */
    private Integer empId;
    private EmpVo empVo;

    private static final long serialVersionUID = 1L;
}
