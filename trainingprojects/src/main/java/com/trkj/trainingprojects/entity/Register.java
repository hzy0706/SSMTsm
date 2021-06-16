package com.trkj.trainingprojects.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * register
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Register implements Serializable {

    private Integer registerId;
    private String consultant;
    private String sex;
    private String phone;
    private Integer attentstate;
    private Integer paystate;
    private String consultcontent;
    public String addname;
    private Date addtime;
    public String updatename;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date updatetime;
    public String deletename;
    private Date deletetime;
    private Integer timeliness;
    private Integer sourceId;
    private Integer courseId;
    private Integer empId;
    private static final long serialVersionUID = 1L;
}