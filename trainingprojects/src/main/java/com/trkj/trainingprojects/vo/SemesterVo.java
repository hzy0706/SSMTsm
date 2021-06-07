package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Date;

/**
 * 学期表(Semester)实体类
 *
 * @author makejava
 * @since 2021-06-02 16:24:12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
@ClassMeta(className = "学期表")
public class SemesterVo{
    private static final long serialVersionUID = -89672233692078935L;
    /**
    * 学期编号
    */
    private Integer semesterId;
    /**
    * 学期名称
    */
    private String semesterName;
    /**
    * 增加人
    */
    private String addname;
    /**
    * 增加时间
    */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date addtime;
    /**
    * 最后修改人
    */
    private String updatename;
    /**
    * 最后修改时间
    */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatetime;
    /**
    * 删除人
    */
    private String deletename;
    /**
    * 删除时间
    */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date deletetime;
    /**
    * 时效性
    */
    private Integer timeliness;


}