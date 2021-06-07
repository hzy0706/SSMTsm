package com.trkj.trainingprojects.vo;

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
@ClassMeta(className = "学员表")
public class StudentVo {
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