package com.trkj.trainingprojects.dao;


import com.trkj.trainingprojects.vo.SystemselectVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 制度允许查看表(Systemselect)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-30 23:14:21
 */
@Mapper
public interface SystemselectDao {

    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    List<SystemselectVo> selectSystemById(int empId);





}