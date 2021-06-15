package com.trkj.trainingprojects.dao;


import com.trkj.trainingprojects.vo.SemesterVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 学期表(Semester)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-02 16:24:12
 */
@Mapper
public interface SemesterDao {
    /**
     * 通过实体作为筛选条件查询
     *
     * @param semester 实例对象
     * @return 对象列表
     */
    SemesterVo selectById(SemesterVo semester);

    /**
     * 新增数据
     *
     * @param semesterVo 实例对象
     * @return 影响行数
     */
    int addSemesterALL(SemesterVo semesterVo);


    /**
     *
     * 通过主键修改数据
     *
     * @param semester 实例对象
     * @return 影响行数
     */
    int updateSemesterById(SemesterVo semester);

    /**
     * 查询所有
     */
    List<SemesterVo> selectALL();

    /**
     * 根据id删除
     * @param
     * @return
     */
    int delSemesterById(SemesterVo semesterVo);
}