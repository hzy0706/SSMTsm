package com.trkj.trainingprojects.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
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
@ClassMeta(className = "咨询登记表")
public class RegisterVo {
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
//    外键
    private Integer sourceId;
    private SourceVo sourceVo;
    private Integer courseId;
    private CourseVo courseVo;
    private Integer empId;
    private EmpVo empVo;
    private static final long serialVersionUID = 1L;
}
