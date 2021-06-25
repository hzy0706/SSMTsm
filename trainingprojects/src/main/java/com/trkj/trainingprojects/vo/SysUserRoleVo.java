package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
@ClassMeta(className = "用户角色表")
public class SysUserRoleVo {
    private Integer id;

    /**
     * 角色自增id
     */
    private Integer roleId;

    /**
     * 用户自增id
     */
    private Integer userId;

    private static final long serialVersionUID = 1L;
}
