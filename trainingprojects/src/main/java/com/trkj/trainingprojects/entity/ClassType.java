package com.trkj.trainingprojects.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 课类表(ClassType)实体类
 *
 * @author makejava
 * @since 2021-05-29 09:20:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "courses")
public class ClassType implements Serializable {
    /**
     * 课类编号
     */
    private Integer classtypeId;
    /**
     * 课类名称
     */
    private String classtypeName;
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

    private List<Course> courses;
    private static final long serialVersionUID = 1L;
}
