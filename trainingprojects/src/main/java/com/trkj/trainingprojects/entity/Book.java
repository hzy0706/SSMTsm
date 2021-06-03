package com.trkj.trainingprojects.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * book
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "course")
public class Book implements Serializable {
    /**
     * 教材编号
     */
    private Integer bookId;

    /**
     * 教材名称
     */
    private String bookname;

    /**
     * 库存
     */
    private Integer deliverycount;

    /**
     * 教材售价
     */
    private BigDecimal booksprice;

    /**
     * 教材进价
     */
    private BigDecimal bookjprice;

    /**
     * 安全库存
     */
    private Integer safestock;

    /**
     * 出版社
     */
    private String press;

    /**
     * 新增人员
     */
    private String addname;

    /**
     * 新增时间
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
     * 总入库量
     */
    private Integer storage;

    /**
     * 课程编号
     */
    private Integer courseId;
    private Course course;

    private static final long serialVersionUID = 1L;
}