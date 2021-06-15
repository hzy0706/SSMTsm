package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.RegisterVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Mapper
public interface RegisterDao {
    int deleteByPrimaryKey(Integer registerId);

    int insert(RegisterVo record);

    int insertSelective(RegisterVo record);

    RegisterVo selectByRegisterKey(Integer registerId);

    int updateByRegisterKey(RegisterVo record);

    int delByRegisterKey(RegisterVo record);
    //    查询
    List<RegisterVo> findRegister();
    //    外键查询
    List<RegisterVo> findRegister2();
//    模糊查询
    List<RegisterVo> mohuRegister(@Param("value") String registerName);
}