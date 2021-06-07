package com.trkj.trainingprojects.entity;
import java.util.Date;
import java.io.Serializable;

/**
 * 意见箱表(Suggest)实体类
 *
 * @author makejava
 * @since 2021-06-04 17:11:12
 */
public class Suggest implements Serializable {
    /**
    * 意见箱编号
    */
    private Integer suggestId;
    /**
    * 意见箱名称
    */
    private String suggestName;
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
    * 部门编号
    */
    private Integer deptId;

    private static final long serialVersionUID = 1L;
}