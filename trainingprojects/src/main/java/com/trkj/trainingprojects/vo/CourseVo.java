package com.trkj.trainingprojects.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.trkj.trainingprojects.ann.ClassMeta;
import com.trkj.trainingprojects.entity.ItemBank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
@ClassMeta(className = "课程表")
@ToString(exclude = "classType,coursedetailsVos,itemBanks")
public class CourseVo {
    private Integer courseId;
    private String courseName;
    private Integer courseState;
    private Integer classhours;
    private BigDecimal courseMoney;
    private BigDecimal commission;
    public String addname;
    private Date addtime;
    public String updatename;
    private Date updatetime;
    private String stopname;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date stoptime;
    private String beginname;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date begintime;
    public String deletename;
    private Date deletetime;
    private Integer timeliness;
    private Integer classtypeId;

    private ClassTypeVo classTypeVo;

    private List<CourseDetailsVo> coursedetailsVos;

    private List<ItemBank> itemBanks;
    private static final long serialVersionUID = 1L;
}
