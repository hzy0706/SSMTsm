package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@ClassMeta(className = "工作交接表")
@ToString(exclude = "registerVo")
public class MemorandumattachmentVo {
    private Integer memorandumattachmentId;
    private Integer zsisexamine;
    private Date zsexaminetime;
    private String zsexaminename;
    private Date zsrevoketime;
    private String zsrevokename;
    private Integer jwisexamine;
    private Date jwexaminetime;
    private String jwexaminename;
    private Date jwrevoketime;
    private String jwrevokename;
    private Integer registerId;
    private RegisterVo registerVo;

    private static final long serialVersionUID = 1L;
}
