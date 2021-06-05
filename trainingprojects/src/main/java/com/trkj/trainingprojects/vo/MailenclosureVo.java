package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
@ClassMeta(className = "邮件附件表")
public class MailenclosureVo {
    /**
     * 邮件附件编号
     */
    private Integer mailenclosureId;

    /**
     * 邮件附件
     */
    private String enclosure;

    /**
     * 邮件编号
     */
    private Integer mailId;
    private MailVo mailVo;

    private static final long serialVersionUID = 1L;
}
