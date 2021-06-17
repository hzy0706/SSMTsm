package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.Studentstatus;

import java.util.List;

/**
 * 学员分班表(Studentstatus)表服务接口
 *
 * @author makejava
 * @since 2021-06-17 16:44:45
 */
public interface StudentstatusService {

    Studentstatus queryById(Integer studentstatusId);

    List<Studentstatus> queryAllByLimit(int offset, int limit);

    Studentstatus insert(Studentstatus studentstatus);

    Studentstatus update(Studentstatus studentstatus);

    boolean deleteById(Integer studentstatusId);

}
