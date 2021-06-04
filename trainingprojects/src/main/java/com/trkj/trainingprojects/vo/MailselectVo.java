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
@ClassMeta(className = "邮件查看表")
public class MailselectVo {
    /**
     * 邮件允许查看编号
     */
    private Integer mailselectId;

    /**
     * 阅读时间
     */
    private Date readtime;

    /**
     * 阅读状态
     */
    private Integer readstate;

    /**
     * 邮件编号
     */
    private Integer mailId;
    private MailVo mailVo;

    /**
     * 允许查看用户编号
     */
    private Integer empId;
    private EmpVo empVo;

    private static final long serialVersionUID = 1L;
}
