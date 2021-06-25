package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.UnitVo;

import java.util.List;

/**
 * 单位表(Unit)表服务接口
 *
 * @author makejava
 * @since 2021-06-03 16:30:39
 */
public interface UnitService {

    /**
     * 通过ID查询单条数据
     *
     * @param unitId 主键
     * @return 实例对象
     */
    UnitVo selectById(Integer unitId);


    /**
     * 新增数据
     *
     * @param unitVo 实例对象
     * @return 影响行数
     */
    int addUnit(UnitVo unitVo);

    /**
     * 修改数据
     *
     * @param unitVo 实例对象
     * @return 影响行数
     */
    int updateUnit(UnitVo unitVo);


    /**
     * 查询所有
     *
     */
    List<UnitVo> selectAllUnit();
    /**
     * 删除
     */
    int delUnitById(UnitVo unitVo);
}