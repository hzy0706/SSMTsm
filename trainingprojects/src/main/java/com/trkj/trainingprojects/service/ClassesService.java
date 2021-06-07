package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.Classes;
import com.trkj.trainingprojects.vo.ClassesVo;

import java.util.List;

/**
 * 班级表(Classes)表服务接口
 *
 * @author makejava
 * @since 2021-06-02 12:42:36
 */
public interface ClassesService {

    Classes queryById(Integer classesId);

    List<Classes> queryAllByLimit(int offset, int limit);

    Classes insert(Classes classes);

    Classes update(Classes classes);

    boolean deleteById(Integer classesId);

    public List<ClassesVo> selectAllClasses();
    public void addClasses(ClassesVo classesVo);
    public int deleteByClasses(ClassesVo classesVo);
    public int updateClassesKey(ClassesVo classesVo);
}