package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.UnitVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 单位表(Unit)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-03 16:30:39
 */
@Mapper
public interface UnitDao {

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
    int update(UnitVo unitVo);


    /**
     * 查询所有
     *
     */
    List<UnitVo> selectAll();

    /**
     * 根据id删除
     */
    int delUnitById(UnitVo unitVo);
}