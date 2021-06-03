package com.trkj.trainingprojects.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * bookback
 * @author 
 */
@Data
public class Bookback implements Serializable {
    /**
     * 教材破损编号
     */
    private Integer bookbackId;

    /**
     * 破损原因描述
     */
    private String causeofdamage;

    /**
     * 破损处理时间
     */
    private Date storagetime;

    /**
     * 审批
     */
    private Integer approval;

    /**
     * 审批人
     */
    private String appname;

    /**
     * 审批时间
     */
    private Date apptime;

    /**
     * 撤销审批人
     */
    private String revokeAppname;

    /**
     * 撤销审批时间
     */
    private Date revokeApptime;

    /**
     * 增加人
     */
    private String addname;

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
     * 教材编号
     */
    private Integer bookId;

    /**
     * 职工编号
     */
    private Integer empId;

    private static final long serialVersionUID = 1L;
}