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
@ClassMeta(className = "意见表")
public class IdeasVo {
    /**
     * 意见编号
     */
    private Integer ideasId;

    /**
     * 意见标题
     */
    private String ideasTitle;

    /**
     * 意见内容
     */
    private String ideasContent;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 发布意见人
     */
    private String ename;

    /**
     * 回复人
     */
    private String reply;

    /**
     * 回复时间
     */
    private Date revoverytime;

    /**
     * 回复内容
     */
    private String revoverycontent;

    /**
     * 发表时间
     */
    private Date timeofpublication;

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
     * 意见箱编号
     */
    private Integer suggestId;
    private SuggestVo suggestVo;

    /**
     * 发表意见人编号
     */
    private Integer empId;
    private EmpVo empVo;

    private static final long serialVersionUID = 1L;
}
