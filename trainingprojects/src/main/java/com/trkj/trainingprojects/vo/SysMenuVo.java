package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ClassMeta(className = "菜单表")
@Validated
public class SysMenuVo {
    private Integer id;

    /**
     * 父菜单ID
     */
    private Integer menuPid;

    /**
     * 当前菜单所有父菜单
     */
    private String menuPids;

    /**
     * 0:不是叶子节点，1:是叶子节点
     */
    private Byte isLeaf;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 允许客户端提交的方法get查询/post添加/put修改/delete删除
     */
    private String method;

    /**
     * 跳转URL
     */
    private String url;

    /**
     * 组件名称
     */
    private String componentName;

    /**
     * 组件地址
     */
    private String componentPath;

    private String icon;

    private String iconColor;

    /**
     * 排序
     */
    private Byte sort;

    /**
     * 菜单层级
     */
    private Byte level;

    /**
     * 0:启用,1:禁用
     */
    private Byte status;

    private static final long serialVersionUID = 1L;

    private List<SysMenuVo> asideChildren = new ArrayList<SysMenuVo>();
}
