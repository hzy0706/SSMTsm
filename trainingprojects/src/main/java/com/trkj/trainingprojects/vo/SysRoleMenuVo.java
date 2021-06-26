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
@ClassMeta(className = "角色与权限表")
public class SysRoleMenuVo {
    private Integer id;

    /**
     * 角色id
     */
    private Integer roleId;


    /**
     * 权限id
     */
    private Integer menuId;
}
