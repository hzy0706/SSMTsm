package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.entity.System;
import com.trkj.trainingprojects.dao.SystemDao;
import com.trkj.trainingprojects.service.SystemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 规章制度表(System)表服务实现类
 *
 * @author makejava
 * @since 2021-06-30 23:12:04
 */
@Service("systemService")
public class SystemServiceImpl implements SystemService {
    @Resource
    private SystemDao systemDao;

    /**
     * 通过ID查询单条数据
     *
     * @param systemId 主键
     * @return 实例对象
     */
    @Override
    public System queryById(Integer systemId) {
        return this.systemDao.queryById(systemId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<System> queryAllByLimit(int offset, int limit) {
        return this.systemDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param system 实例对象
     * @return 实例对象
     */
    @Override
    public System insert(System system) {
        this.systemDao.insert(system);
        return system;
    }

    /**
     * 修改数据
     *
     * @param system 实例对象
     * @return 实例对象
     */
    @Override
    public System update(System system) {
        this.systemDao.update(system);
        return this.queryById(system.getSystemId());
    }

    /**
     * 通过主键删除数据
     *
     * @param systemId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer systemId) {
        return this.systemDao.deleteById(systemId) > 0;
    }
}