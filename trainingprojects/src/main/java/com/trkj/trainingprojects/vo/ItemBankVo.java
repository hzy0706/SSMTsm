package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;
import com.trkj.trainingprojects.entity.Course;
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
@ClassMeta(className = "题库表")
@ToString(exclude = "courses")
public class ItemBankVo {
    /**
     * 题库编号
     */
    private Integer itembankId;
    /**
     * 题目类型
     */
    private String itembankType;
    /**
     * 题目内容
     */
    private String itembankContent;
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
     * 课程编号
     */
    private Integer courseId;

    private Course course;
    private static final long serialVersionUID = 1L;
}
