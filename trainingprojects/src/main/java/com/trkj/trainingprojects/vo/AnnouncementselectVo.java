package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Date;

/**
 * 公告允许查看表(Announcementselect)实体类
 *
 * @author makejava
 * @since 2021-06-30 15:24:36
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
@ClassMeta(className = "公告允许查看表")
public class AnnouncementselectVo implements Serializable {
    private static final long serialVersionUID = 280312318515585601L;
    /**
    * 公告允许查看编号
    */
    private Integer announcementselectId;
    /**
    * 阅读状态
    */
    private Integer readstate;
    /**
    * 阅读时间
    */
    private Date readtime;
    /**
    * 公告编号
    */
    private Integer announcementId;
    private AnnouncementVo announcementVo;

    /**
    * 允许查看用户编号
    */
    private Integer empId;

}