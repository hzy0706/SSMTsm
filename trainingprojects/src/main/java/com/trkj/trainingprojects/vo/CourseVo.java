package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
@ClassMeta(className = "课程表")
public class CourseVo {
    /**
     * 课程编号
     */
    private Integer courseId;

    /**
     * 课程名称
     */
    private String courseName;

    /**
     * 课程状态
     */
    private Integer courseState;

    /**
     * 课时量
     */
    private Integer classhours;

    /**
     * 课程费用
     */
    private BigDecimal courseMoney;

    /**
     * 招生部提成
     */
    private BigDecimal commission;

    /**
     * 增加人
     */
    private String addname;

    /**
     * 增加时间
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
     * 停报办理人
     */
    private String stopname;

    /**
     * 停报时间
     */
    private Date stoptime;

    /**
     * 开报办理人
     */
    private String beginname;

    /**
     * 开报时间
     */
    private Date begintime;

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
     * 课类编号
     */
    private Integer classtypeId;

    private static final long serialVersionUID = 1L;
}
