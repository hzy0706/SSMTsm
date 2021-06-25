package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.ClassRoom;
import com.trkj.trainingprojects.vo.ClassRoomVo;

import java.util.List;

/**
 * 教室表(ClassRoom)表服务接口
 *
 * @author makejava
 * @since 2021-06-02 12:43:01
 */
public interface ClassRoomService {

    ClassRoom queryById(Integer classroomId);

    List<ClassRoom> queryAllByLimit(int offset, int limit);

    ClassRoom insert(ClassRoom classroom);

    ClassRoom update(ClassRoom classroom);

    boolean deleteById(Integer classroomId);
    List<ClassRoomVo> selectAllClassRoomsByState(Integer state);
    public List<ClassRoomVo> selectAllClassRooms();
    public void addClassRoom(ClassRoomVo classRoomVo);
    public int deleteByClassRoom(ClassRoomVo classRoomVo);
    public int updateByClassRoomKey(ClassRoomVo classRoomVo);
    public int updateClassRoomState(ClassRoomVo classRoomVo);
}
