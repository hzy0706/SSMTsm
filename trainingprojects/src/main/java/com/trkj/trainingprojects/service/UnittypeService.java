package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.UnittypeVo;

import java.util.List;

/**
 * 单位类型表(Unittype)表服务接口
 *
 * @author makejava
 * @since 2021-06-21 10:32:38
 */
public interface UnittypeService {

    /**
     * 查询所有
     *
     */
    List<UnittypeVo> selectAllUnitType();


    /**
     * 新增数据
     *
     * @param unittypeVo 实例对象
     * @return 影响行数
     */
    int addUnitType(UnittypeVo unittypeVo);

    /**
     * 通过主键删除数据
     *
     * @param unittypeId 主键
     * @return 影响行数
     */
    int delUnitTypeById(Integer unittypeId);


}