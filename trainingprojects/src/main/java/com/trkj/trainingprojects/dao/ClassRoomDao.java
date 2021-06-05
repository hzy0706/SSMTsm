package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.ClassRoom;
import com.trkj.trainingprojects.vo.ClassRoomVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 教室表(ClassRoom)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-02 12:43:00
 */
@Mapper
public interface ClassRoomDao {

    ClassRoom queryById(Integer classroomId);

    List<ClassRoom> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<ClassRoom> queryAll(ClassRoom classroom);

    int insert(ClassRoomVo classRoomVo);

    int insertBatch(@Param("entities") List<ClassRoom> entities);

    int insertOrUpdateBatch(@Param("entities") List<ClassRoom> entities);

    int updateByClassRoomKey(ClassRoomVo classRoomVo);

    int deleteById(Integer classroomId);

    List<ClassRoomVo> selectAllClassRooms();
    int deleteByClassRoom(ClassRoomVo classRoomVo);
}

