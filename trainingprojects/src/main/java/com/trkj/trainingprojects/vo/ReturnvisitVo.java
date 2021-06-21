package com.trkj.trainingprojects.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@ClassMeta(className = "回访表")
@ToString(exclude = "registerVo,empVo")
public class ReturnvisitVo {
    private Integer returnvisitId;
    private String returnvisitmode;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date returnvisitdate;
    private String returncontent;
    private String returnvisitback;
    public String addname;
    private Date addtime;
    public String deletename;
    private Date deletetime;
    private Integer timeliness;
    private Integer registerId;
    private RegisterVo registerVo;
    private Integer empId;
    private EmpVo empVo;
    private static final long serialVersionUID = 1L;
}
