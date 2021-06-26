package com.trkj.trainingprojects.util;

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
}
