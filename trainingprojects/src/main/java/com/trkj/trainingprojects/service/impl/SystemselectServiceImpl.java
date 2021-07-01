package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.entity.Systemselect;
import com.trkj.trainingprojects.dao.SystemselectDao;
import com.trkj.trainingprojects.service.SystemselectService;
import com.trkj.trainingprojects.vo.SystemselectVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 制度允许查看表(Systemselect)表服务实现类
 *
 * @author makejava
 * @since 2021-06-30 23:14:21
 */
@Service("systemselectService")
public class SystemselectServiceImpl implements SystemselectService {
    @Resource
    private SystemselectDao systemselectDao;

    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */


    @Override
    public List<SystemselectVo> selectSystemById(int empId) {
        return systemselectDao.selectSystemById(empId);
    }


}