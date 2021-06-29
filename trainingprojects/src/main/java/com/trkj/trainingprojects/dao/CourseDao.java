package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.Course;
import com.trkj.trainingprojects.vo.CourseVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 课程表(Course)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-01 13:56:08
 */
@Mapper
public interface CourseDao {

    CourseVo queryById(Integer courseId);

    List<Course> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<Course> queryAll(Course course);

    int insertBatch(@Param("entities") List<Course> entities);

    int insertOrUpdateBatch(@Param("entities") List<Course> entities);

    int deleteById(Integer courseId);

    List<CourseVo> selectAllCourses();  //查询
    int deleteByCourse(CourseVo courseVo);  //删除
    int updateByCourseKey(CourseVo courseVo);   //修改
    int insert(CourseVo courseVo);    //添加
    int updateByCoursePel(CourseVo courseVo);   //修改为停报
    List<CourseVo> selectAllCourses2();     //查询所有不分页
    int updateByCourseHouse(CourseVo courseVo);//根据id修改课程课时
    int updateByCourseHouse2(CourseVo courseVo);//根据id修改课程课时[减少]
    int selectCourseDelectOne(int classtypeid);//根据课程类型id查询
    int updateByCourseHouse3(int courseid);//根据id修改课程课时[减少]批量
}

