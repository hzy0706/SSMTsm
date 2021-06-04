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
@ClassMeta(className = "日程评论表")
public class DaillogreplyVo {
    /**
     * 日程评论编号
     */
    private Integer daillogreplyId;

    /**
     * 评论人
     */
    private String repliername;

    /**
     * 评论时间
     */
    private Date repliertime;

    /**
     * 评论内容
     */
    private String repliercontent;

    /**
     * 日志编号
     */
    private Integer daillogId;
    private DaillogVo daillogVo;

    private static final long serialVersionUID = 1L;
}
