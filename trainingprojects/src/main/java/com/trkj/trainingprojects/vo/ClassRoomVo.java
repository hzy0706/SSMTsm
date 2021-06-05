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
@ClassMeta(className = "教室表")
public class ClassRoomVo {
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
    public String addname;
    /**
     * 增加时间
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

    private static final long serialVersionUID = 1L;
}
