package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
@ClassMeta(className = "FAQ问答表")
public class FaqVo{
    /**
     * FAQ编号
     */
    private Integer faqId;

    /**
     * 问题
     */
    private String problem;

    /**
     * 回答
     */
    private String answer;

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
     * 点击量
     */
    private Integer clickcount;

    /**
     * 时效性
     */
    private Integer timeliness;
}
