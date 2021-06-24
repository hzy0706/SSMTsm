package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.ExamManage;

import java.util.List;

/**
 * 试卷表(ExamManage)表服务接口
 *
 * @author makejava
 * @since 2021-06-24 19:01:33
 */
public interface ExamManageService {

    ExamManage queryById(Integer examcode);

    List<ExamManage> queryAllByLimit(int offset, int limit);

    ExamManage insert(ExamManage examManage);

    ExamManage update(ExamManage examManage);

    boolean deleteById(Integer examcode);

}
