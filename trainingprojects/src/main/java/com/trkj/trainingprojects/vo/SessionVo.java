package com.trkj.trainingprojects.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

/**
 * 年届表(Session)实体类
 *
 * @author makejava
 * @since 2021-06-02 18:52:09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
@ClassMeta(className = "年届表")
public class SessionVo {
    private static final long serialVersionUID = -15357388774898277L;
    /**
    * 年届编号
    */
    private Integer sessionId;
    /**
    * 年届名称
    */
    private String sessionName;
    /**
    * 增加人
    */
    public String addname;
    /**
    * 增加时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date addtime;
    /**
    * 最后修改人
    */
    public String updatename;
    /**
    * 最后修改时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updatetime;
    /**
    * 删除人
    */
    public String deletename;
    /**
    * 删除时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date deletetime;
    /**
    * 时效性
    */
    private Integer timeliness;


}