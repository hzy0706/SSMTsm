package com.trkj.trainingprojects.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * dept
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept implements Serializable {
    /**
     * 部门编号
     */
    private Integer deptId;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 部门序列号
     */
    private String deptSortnumber;

    /**
     * 上级部门编号
     */
    private Integer superiorsDeptId;

    /**
     * 部门描述
     */
    private String deptDescribe;

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

    private static final long serialVersionUID = 1L;

}