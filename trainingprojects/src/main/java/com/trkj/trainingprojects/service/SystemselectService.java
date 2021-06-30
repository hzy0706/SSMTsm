package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.Systemselect;
import com.trkj.trainingprojects.vo.SystemselectVo;

import java.util.List;

/**
 * 制度允许查看表(Systemselect)表服务接口
 *
 * @author makejava
 * @since 2021-06-30 23:14:21
 */
public interface SystemselectService {

    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    List<SystemselectVo> selectSystemById(int empId);





}