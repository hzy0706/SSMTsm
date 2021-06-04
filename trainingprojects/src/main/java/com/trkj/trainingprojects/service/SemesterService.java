package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.Semester;

import java.util.List;

/**
 * 学期表(Semester)表服务接口
 *
 * @author makejava
 * @since 2021-06-02 16:24:12
 */

public interface SemesterService {

    /**
     * 通过ID查询单条数据
     *
     * @param semesterId 主键
     * @return 实例对象
     */
    Semester selectById(Integer semesterId);


    /**
     * 新增数据
     *
     * @param semester 实例对象
     * @return 实例对象
     */
    Semester addsemester(Semester semester);

    /**
     * 修改数据
     *
     * @param semester 实例对象
     * @return 实例对象
     */
    Semester update(Semester semester);

    List<Semester> selectALL();
}