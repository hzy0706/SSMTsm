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
@ClassMeta(className = "奖项表")
@ToString(exclude = "studentVoList,classesVoList")
public class AwardsVo {
    /**
     * 奖项编号
     */
    private Integer awardsId;
    /**
     * 获奖内容
     */
    private String awardscontent;
    /**
     * 获奖日期
     */
    private Date awardsdate;
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
     * 学员编号
     */
    private Integer studentId;
    /**
     * 班级编号
     */
    private Integer classesId;
    private List<StudentVo> studentVoList;
    private List<ClassesVo> classesVoList;
    private static final long serialVersionUID = 1L;

}
