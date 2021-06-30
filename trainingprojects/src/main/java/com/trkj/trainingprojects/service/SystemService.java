package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.System;
import java.util.List;

/**
 * 规章制度表(System)表服务接口
 *
 * @author makejava
 * @since 2021-06-30 23:12:04
 */
public interface SystemService {

    /**
     * 通过ID查询单条数据
     *
     * @param systemId 主键
     * @return 实例对象
     */
    System queryById(Integer systemId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<System> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param system 实例对象
     * @return 实例对象
     */
    System insert(System system);

    /**
     * 修改数据
     *
     * @param system 实例对象
     * @return 实例对象
     */
    System update(System system);

    /**
     * 通过主键删除数据
     *
     * @param systemId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer systemId);

}