package com.trkj.trainingprojects.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 教室表(ClassRoom)实体类
 *
 * @author makejava
 * @since 2021-06-02 12:42:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassRoom implements Serializable {
    /**
     * 教室编号
     */
    private Integer classroomId;
    /**
     * 教室名称
     */
    private String classroomName;
    /**
     * 教室状态
     */
    private Integer classroomState;
    /**
     * 容纳量
     */
    private Integer catacity;
    /**
     * 教室地点
     */
    private String place;
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
