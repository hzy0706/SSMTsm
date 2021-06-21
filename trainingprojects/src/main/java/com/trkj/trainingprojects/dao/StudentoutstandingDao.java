package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.Studentoutstanding;
import com.trkj.trainingprojects.vo.StudentoutstandingVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 学员欠费补缴表(Studentoutstanding)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-18 23:11:33
 */
@Mapper
public interface StudentoutstandingDao {

    Studentoutstanding queryById(Integer outstandingId);

    List<Studentoutstanding> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<Studentoutstanding> queryAll(Studentoutstanding studentoutstanding);

    int insert(StudentoutstandingVo studentoutstandingVo);

    int insertBatch(@Param("entities") List<Studentoutstanding> entities);

    int insertOrUpdateBatch(@Param("entities") List<Studentoutstanding> entities);

    int update(Studentoutstanding studentoutstanding);

    int deleteById(Integer outstandingId);

    List<StudentoutstandingVo> selectAllStudentOutStanding();
}

