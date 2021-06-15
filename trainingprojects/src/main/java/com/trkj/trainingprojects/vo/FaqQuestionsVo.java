package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
@ClassMeta(className="FAQ问答表")
public class FaqQuestionsVo {

    private Integer faqId;
    private String problem;
    private String answer;
    public String addname;
    private Date addtime;
    public String updatename;
    private Date updatetime;
    public String deletename;
    private Date deletetime;
    private Integer clickcount;
    private Integer timeliness;
    private static final long serialVersionUID = 1L;
}
