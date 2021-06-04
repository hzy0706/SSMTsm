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
@ClassMeta(className = "备忘录表")
public class MemorandumVo {
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
    private EmpVo empVo;

    private static final long serialVersionUID = 1L;
}
