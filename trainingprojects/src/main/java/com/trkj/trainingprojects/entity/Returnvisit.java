package com.trkj.trainingprojects.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * returnvisit
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "registerVo,empVo")

public class Returnvisit implements Serializable {

    private Integer returnvisitId;
    private String returnvisitmode;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date returnvisitdate;
    private String returncontent;
    private String returnvisitback;
    public String addname;
    private Date addtime;
    public String deletename;
    private Date deletetime;
    private Integer timeliness;
    private Integer registerId;
    private Integer empId;
    private static final long serialVersionUID = 1L;
}