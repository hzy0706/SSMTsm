package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.Studentoutstanding;
import com.trkj.trainingprojects.vo.StudentoutstandingVo;

import java.util.List;

/**
 * 学员欠费补缴表(Studentoutstanding)表服务接口
 *
 * @author makejava
 * @since 2021-06-18 23:11:37
 */
public interface StudentoutstandingService {

    Studentoutstanding queryById(Integer outstandingId);

    List<Studentoutstanding> queryAllByLimit(int offset, int limit);

    int insert(StudentoutstandingVo studentoutstanding);

    Studentoutstanding update(Studentoutstanding studentoutstanding);

    boolean deleteById(Integer outstandingId);

    public List<StudentoutstandingVo> selectAllStudentOutStanding();
    public void addStudentoutstanding(StudentoutstandingVo studentoutstandingVo);
    int updateByStudentOutStanding(StudentoutstandingVo studentoutstandingVo);
}
