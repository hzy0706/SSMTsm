package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.System;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 规章制度表(System)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-30 23:12:04
 */
@Mapper
public interface SystemDao {

    /**
     * 通过ID查询单条数据
     *
     * @param systemId 主键
     * @return 实例对象
     */
    System queryById(Integer systemId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<System> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param system 实例对象
     * @return 对象列表
     */
    List<System> queryAll(System system);

    /**
     * 新增数据
     *
     * @param system 实例对象
     * @return 影响行数
     */
    int insert(System system);

    /**
     * 修改数据
     *
     * @param system 实例对象
     * @return 影响行数
     */
    int update(System system);

    /**
     * 通过主键删除数据
     *
     * @param systemId 主键
     * @return 影响行数
     */
    int deleteById(Integer systemId);

}