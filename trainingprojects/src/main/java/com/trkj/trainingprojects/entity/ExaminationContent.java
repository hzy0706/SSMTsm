package com.trkj.trainingprojects.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 考试内容表(ExaminationContent)实体类
 *
 * @author makejava
 * @since 2021-06-03 15:17:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "itemBankList,examination")
public class ExaminationContent implements Serializable {
    /**
     * 考试内容表编号
     */
    private Integer examinationcId;
    /**
     * 增加人
     */
    private String addname;
    /**
     * 增加日期
     */
    private Date addtime;
    /**
     * 最后修改人
     */
    private String updatename;
    /**
     * 最后修改时间
     */
    private Date updatetime;
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
     * 考试题库编号
     */
    private Integer itembankId;
    /**
     * 考试总表编号
     */
    private Integer examinationId;

    private List<ItemBank> itemBankList;
    private Examination examination;
    private static final long serialVersionUID = 1L;
}
