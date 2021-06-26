package com.trkj.trainingprojects.TestService;

import com.trkj.trainingprojects.dao.EmpDao;
import com.trkj.trainingprojects.vo.EmpVo;
import com.trkj.trainingprojects.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.dozer.DozerBeanMapper;
import javax.annotation.Resource;

/***
 * @author 大熊
 * @date 2020-07-03
 * @Description:系统用户业务实现接口
 * @version 1.0
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private  static DozerBeanMapper dozerBeanMapper=new DozerBeanMapper();

    @Resource
    private EmpDao empDao;

    public UserServiceImpl() {
    }

  /*  @Override
    public List<UserVo> findAll() {
        List<SysUser> list= userDao.findAll();
        return DozerUtils.mapList(list,UserVo.class);
    }*/

  /*  @Override
    public UserVo addUser(UserVo user) {
        return null;
    }

    @Override
    @Transactional
    public UserVo editUser(UserVo user) {
        log.info("UserServiceImpl开始更新用户信息");
        SysUser sysUser=new SysUser();
        dozerBeanMapper.map(user,sysUser);
        userDao.save(sysUser);
        return user;
    }*/

   /* @Override
    public void delUser(Integer id) {

    }*/

    @Override
    public UserVo findByUsername(String username) {
        EmpVo empVo=empDao.findByUsername(username);
        UserVo vo=new UserVo();
        dozerBeanMapper.map(empVo,vo);
        return vo;
    }
}
