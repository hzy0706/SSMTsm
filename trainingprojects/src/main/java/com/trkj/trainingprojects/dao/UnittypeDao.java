package com.trkj.trainingprojects.dao;


import com.trkj.trainingprojects.vo.UnittypeVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 单位类型表(Unittype)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-21 10:32:38
 */
@Mapper
public interface UnittypeDao {


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
     * @param unittypeVo 主键
     * @return 影响行数
     */
    int delUnitTypeById(UnittypeVo unittypeVo);

}