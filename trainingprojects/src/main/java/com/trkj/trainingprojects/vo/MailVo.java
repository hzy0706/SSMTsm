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
@ClassMeta(className = "邮件表")
public class MailVo {
    /**
     * 邮件编号
     */
    private Integer mailId;

    /**
     * 邮件标题
     */
    private String mailTitle;

    /**
     * 发送时间
     */
    private Date sendtime;

    /**
     * 邮件内容
     */
    private String mailContent;

    /**
     * 删除人
     */
    private String deletename;

    /**
     * 删除时间
     */
    private Date deletetime;

    /**
     * 是否草稿
     */
    private Integer isdraft;

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
