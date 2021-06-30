package com.trkj.trainingprojects.util;

import com.trkj.trainingprojects.entity.SysMenu;
import com.trkj.trainingprojects.vo.SysMenuVo;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class MenuUtil {
    public static List<SysMenuVo> assemberMenus(List<SysMenuVo> menus){
        List<SysMenuVo> one=menus.stream().filter(u -> u.getMenuPid()==0).collect(Collectors.toList());
        log.debug(one.toString());
        one.forEach(o->{
            List<SysMenuVo> two=menus.stream().filter(u -> u.getMenuPid()==o.getId()).collect(Collectors.toList());
            o.setAsideChildren(two);
        });
        return one;
    }
    public static List<SysMenuVo>  assemberMenus2(List<SysMenuVo>  menus){
        List<SysMenuVo>  one=menus.stream().filter(u -> u.getMenuPid()==0).collect(Collectors.toList());
        log.debug(one.toString());
        one.forEach(o->{
            List<SysMenuVo>  two=menus.stream().filter(u -> u.getMenuPid()==o.getId()).collect(Collectors.toList());
            two.forEach(o2->{
                List<SysMenuVo>  three=menus.stream().filter(u -> u.getMenuPid().equals(o2.getId())).collect(Collectors.toList());
                o2.setAsideChildren(three);
            });
            o.setAsideChildren(two);
        });
        return one;
    }
}
