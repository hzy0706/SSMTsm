package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.Announcementselect;
import com.trkj.trainingprojects.vo.AnnouncementselectVo;

import java.util.List;

/**
 * 公告允许查看表(Announcementselect)表服务接口
 *
 * @author makejava
 * @since 2021-06-30 15:24:36
 */
public interface AnnouncementselectService {

    /**
     * 通过ID查询单条数据
     *
     * @param announcementselectId 主键
     * @return 实例对象
     */
    Announcementselect queryById(Integer announcementselectId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Announcementselect> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param announcementselect 实例对象
     * @return 实例对象
     */
    Announcementselect insert(Announcementselect announcementselect);

    /**
     * 修改数据
     *
     * @param announcementselect 实例对象
     * @return 实例对象
     */
    Announcementselect update(Announcementselect announcementselect);

    /**
     * 通过主键删除数据
     *
     * @param announcementselectId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer announcementselectId);

    List<AnnouncementselectVo> selectByEmpId(int empId);
}