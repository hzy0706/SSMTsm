package com.trkj.trainingprojects.TestService;
import com.trkj.trainingprojects.dao.SysMenuDao;
import com.trkj.trainingprojects.vo.SysMenuVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/***
 * @author 大熊
 * @date 2020-07-03
 * @Description:菜单（权限）业务实现类
 * @version 1.0
 */
@Service
@Slf4j
public class MenuServiceImpl implements MenuService {
    @Resource
    private SysMenuDao sysMenuDao;
    @Override
    public List<SysMenuVo> findMenuByPidAndLevel(int pid, byte level) {
        log.info("开始查询菜单,pid={},level={}",pid,level);
       // List<SysMenu> list=sysMenuDao.findByMenuPidAndAndLevelOrderBySortDesc(pid,level);
       // return DozerUtils.mapList(list, MenuVo.class);
        return null;
    }
}
