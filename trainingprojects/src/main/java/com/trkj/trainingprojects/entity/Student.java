package com.trkj.trainingprojects.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 学员表(Student)实体类
 *
 * @author makejava
 * @since 2021-06-03 19:50:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    /**
     * 学员编号
     */
    private Integer studentId;
    /**
     * 学员姓名
     */
    private String studentName;
    /**
     * 学员状态
     */
    private Integer studentState;
    /**
     * 性别
     */
    private String sex;
    /**
     * 联系电话
     */
    private String studentPhone;
    /**
     * 居住地址
     */
    private String address;
    /**
     * 照片地址
     */
    private String imgaddress;
    /**
     * 家长姓名
     */
    private String parentname;
    /**
     * 家长电话
     */
    private String parentphone;
    /**
     * 学号
     */
    private String studentNumber;
    /**
     * 备注
     */
    private String entrance;
    /**
     * 就读时间
     */
    private Date studytime;
    /**
     * 增加人
     */
    public String addname;
    /**
     * 增加日期
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
     * 班级编号
     */
    private Integer classesId;
    /**
     * 生源渠道编号
     */
    private Integer sourceId;
    /**
     * 咨询登记编号
     */
    private Integer registerId;

    private static final long serialVersionUID = 1L;
}
