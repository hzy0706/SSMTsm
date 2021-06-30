package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Validated
@AllArgsConstructor
@NoArgsConstructor
@Data
@ClassMeta(className = "生源渠道表")
public class SourceVo {
    private Integer sourceId;
    private String sourceName;
    private Integer already;
    private Integer potential;
    public String addname;
    private Date addtime;
    public String updatename;
    private Date updatetime;
    public String deletename;
    private Date deletetime;
    private Integer timeliness;
    private static final long serialVersionUID = 1L;
}
