package com.trkj.trainingprojects.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * faq_questions
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FaqQuestions implements Serializable {

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