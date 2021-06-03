package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.entity.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
@ClassMeta(className = "部门表")
public class DeptVo {
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
    public String addname;

    /**
     * 增加时间
     */
    private Date addtime;

    /**
     * 最后修改人
     */
    public String updatename;

    /**
     * 最后修改时间
     */
    private Date updatetime;

    /**
     * 删除人
     */
    public String deletename;

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
