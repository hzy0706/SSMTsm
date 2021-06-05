package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;

@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
@ClassMeta(className = "考试内容表")
@ToString(exclude = "itemBankVoList,examinationVo")
public class ExaminationContentVo {
    /**
     * 考试内容表编号
     */
    private Integer examinationcId;
    /**
     * 增加人
     */
    public String addname;
    /**
     * 增加日期
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
     * 考试题库编号
     */
    private Integer itembankId;
    /**
     * 考试总表编号
     */
    private Integer examinationId;

    private List<ItemBankVo> itemBankVoList;
    private ExaminationVo examinationVo;
    private static final long serialVersionUID = 1L;
}
