package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.ClassType;
import com.trkj.trainingprojects.vo.ClassTypeVo;

import java.util.List;

/**
 * 课类表(ClassType)表服务接口
 *
 * @author makejava
 * @since 2021-05-29 09:20:14
 */
public interface ClassTypeService {
    ClassType queryById(Integer classtypeId);
    List<ClassType> queryAllByLimit(int offset, int limit);
    boolean deleteById(Integer classtypeId);

    public List<ClassTypeVo> selectAllClassTypes();
    public void addClassType(ClassTypeVo classtypeVo);
    public int updateByClassTypeKey(ClassTypeVo classTypeVo);
    public int deleteByClassType(ClassTypeVo classTypeVo);
    public List<ClassTypeVo> selectAllClassTypes2();
}
