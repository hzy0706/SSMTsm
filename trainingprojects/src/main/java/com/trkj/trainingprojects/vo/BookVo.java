package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
@ClassMeta(className = "教材表")
@ToString(exclude = "courseVo")
public class BookVo {
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
    public String addname;

    /**
     * 新增时间
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

    /**
     * 总入库量
     */
    private Integer storage;

    /**
     * 总出库量
     */
    private Integer outbound;

    /**
     * 总破损量
     */
    private Integer damage;
    /**
     * 课程编号
     */
    private Integer courseId;
    private CourseVo courseVo;

    private static final long serialVersionUID = 1L;
}
