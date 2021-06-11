package com.trkj.trainingprojects.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
@Validated
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OpjournalVo {
    /**
     * 操作日志编号
     */
    private Integer opjournalId;

    /**
     * 操作内容
     */
    private String opcontent;

    /**
     * 操作时间
     */
    private Date optime;

    /**
     * 操作人姓名
     */
    private String empName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getOptime() {
        return optime;
    }

    private static final long serialVersionUID = 1L;
}
