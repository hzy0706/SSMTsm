package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.ClassRoomDao;
import com.trkj.trainingprojects.entity.ClassRoom;
import com.trkj.trainingprojects.service.ClassRoomService;
import com.trkj.trainingprojects.vo.ClassRoomVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class ClassRoomServiceImpl implements ClassRoomService {
    @Resource
    private ClassRoomDao classroomDao;
    @Override
    public ClassRoom queryById(Integer classroomId) {
        return null;
    }

    @Override
    public List<ClassRoom> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public ClassRoom insert(ClassRoom classroom) {
        return null;
    }

    @Override
    public ClassRoom update(ClassRoom classroom) {
        return null;
    }

    @Override
    public boolean deleteById(Integer classroomId) {
        return false;
    }

    @Override
    public List<ClassRoomVo> selectAllClassRoomsByState(Integer state) {
        return classroomDao.selectAllClassRoomsByState(state);
    }

    @Override
    public List<ClassRoomVo> selectAllClassRooms() {
        return classroomDao.selectAllClassRooms();
    }

    @Override
    @Transactional
    public void addClassRoom(ClassRoomVo classRoomVo) {
        classroomDao.insert(classRoomVo);
    }

    @Override
    @Transactional
    public int deleteByClassRoom(ClassRoomVo classRoomVo) {
        return classroomDao.deleteByClassRoom(classRoomVo);
    }

    @Override
    @Transactional
    public int updateByClassRoomKey(ClassRoomVo classRoomVo) {
        return classroomDao.updateByClassRoomKey(classRoomVo);
    }

    @Override
    public int updateClassRoomState(ClassRoomVo classRoomVo) {
        return classroomDao.updateClassRoomState(classRoomVo);
    }
}
