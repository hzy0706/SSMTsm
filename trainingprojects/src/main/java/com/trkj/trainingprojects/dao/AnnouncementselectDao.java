package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.Announcementselect;
import com.trkj.trainingprojects.vo.AnnouncementselectVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 公告允许查看表(Announcementselect)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-30 15:24:36
 */
@Mapper
public interface AnnouncementselectDao {



    /**
     * 新增数据
     *
     * @param announcementselect 实例对象
     * @return 影响行数
     */
    int insert(Announcementselect announcementselect);

    /**
     * 修改数据
     *
     * @param announcementselect 实例对象
     * @return 影响行数
     */
    int update(Announcementselect announcementselect);

    /**
     * 通过主键删除数据
     *
     * @param announcementselectId 主键
     * @return 影响行数
     */
    int deleteById(Integer announcementselectId);

    List<AnnouncementselectVo> selectByEmpId(int empId);
}