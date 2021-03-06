package com.trkj.trainingprojects.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * source
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Source implements Serializable {

    private Integer sourceId;
    private String sourceName;
    private Integer already;
    private Integer potential;
    private String addname;
    private Date addtime;
    private String updatename;
    private Date updatetime;
    private String deletename;
    private Date deletetime;
    private Integer timeliness;
    private static final long serialVersionUID = 1L;
}