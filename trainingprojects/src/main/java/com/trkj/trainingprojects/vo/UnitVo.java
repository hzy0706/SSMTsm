package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Date;

/**
 * 单位表(Unit)实体类
 *
 * @author makejava
 * @since 2021-06-03 16:30:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
@ClassMeta(className = "单位表")
public class UnitVo implements Serializable {
    private static final long serialVersionUID = 716394578968926959L;
    /**
    * 单位编号
    */
    private Integer unitId;
    /**
    * 单位名称
    */
    private String unitName;
    /**
    * 单位级别
    */
    private String unitLevel;
    /**
    * 负责人
    */
    private String director;
    /**
    * 单位地址
    */
    private String unitAddress;
    /**
    * 邮政编码
    */
    private String mailcode;
    /**
    * 单位电话
    */
    private String unitPhone;
    /**
    * 电子邮件
    */
    private String email;
    /**
    * 简介
    */
    private String profile;
    /**
    * 备注
    */
    private String remarks;
    /**
    * 增加人
    */
    private String addname;
    /**
    * 增加时间
    */
    private Date addtime;
    /**
    * 最后修改人
    */
    private String updatename;
    /**
    * 最后修改时间
    */
    private Date updatetime;
    /**
    * 删除人
    */
    private String deletename;
    /**
    * 删除时间
    */
    private Date deletetime;
    /**
    * 时效性
    */
    private Integer timeliness;
    /**
    * 单位类型
    */
    private Integer unittypeId;
    private String  UnitTypeName;



}