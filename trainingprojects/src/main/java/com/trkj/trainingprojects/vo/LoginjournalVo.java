package com.trkj.trainingprojects.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class LoginjournalVo {
    /**
     * 登录日志编号
     */
    private Integer loginjournalId;

    /**
     * 登录时间
     */
    private Date logintime;

    /**
     * 职工编号
     */
    private Integer empId;
    private EmpVo empVo;

    private static final long serialVersionUID = 1L;
}
