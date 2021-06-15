package com.trkj.trainingprojects.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * memorandum
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Memorandum implements Serializable {
    /**
     * 备忘录编号
     */
    private Integer memorandumId;

    /**
     * 备忘录标题
     */
    private String memorandumTitle;

    /**
     * 备忘录创建时间
     */
    private Date addtime;
    /**
     * 备忘录内容
     */
    private String memorandumContent;

    /**
     * 备忘录类型
     */
    private String memorandumType;

    /**
     * 删除时间
     */
    private Date deletetime;

    /**
     * 时效性
     */
    private Integer timeliness;

    /**
     * 职工编号
     */
    private Integer empId;
    private Emp emp;

    private static final long serialVersionUID = 1L;
}