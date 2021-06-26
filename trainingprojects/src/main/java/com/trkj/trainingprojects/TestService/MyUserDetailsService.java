package com.trkj.trainingprojects.TestService;


import com.trkj.trainingprojects.dao.EmpDao;
import com.trkj.trainingprojects.dao.SysMenuDao;
import com.trkj.trainingprojects.dao.SysRoleDao;
import com.trkj.trainingprojects.vo.EmpVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/***
 * @author 大熊
 * @date 2020-07-03
 * @Description:自定义的UserDetailsService业务实现类
 * @version 1.0
 */
@Slf4j
@Component
public class MyUserDetailsService implements UserDetailsService {

    @Resource
    private EmpDao empDao;
    @Resource
    private SysRoleDao sysRoleDao;
    @Resource
    private SysMenuDao sysMenuDao;
    @Override
    /*@Cacheable(value = "user",key = "#username", unless="#result == null")*/
    public EmpVo loadUserByUsername(String username) throws UsernameNotFoundException {
       log.debug("开始加载基础用户信息");
        //加载基础用户信息
        EmpVo empVo = empDao.findByUsername(username);
        if (empVo==null){
            throw new UsernameNotFoundException("用户不存在");
        }
        log.debug("开始加载角色信息");
        //加载角色信息
        List<String> roleCodes=sysRoleDao.findRoleByUserName(empVo.getUsername());
        log.debug("开始加载权限信息");
        //根据角色列表加载当前用户
       //根据角色列表加载当前用户具有的权限
        List<String> authorities =sysMenuDao.findAuthorityByRoleCodes(roleCodes);
        //为角色标识加上ROLE_前缀（Spring Security规范）
        roleCodes = roleCodes.stream()
                .map(rc -> "ROLE_" + rc)
                .collect(Collectors.toList());
        authorities.addAll(roleCodes);
        //设置用户权限
        empVo.setAuthorities(AuthorityUtils.commaSeparatedStringToAuthorityList(
                String.join(",",authorities)
        ));

        log.info("用户查询完成，返回user,其权限为:"+empVo.getAuthorities());
        return empVo;
    }
}
