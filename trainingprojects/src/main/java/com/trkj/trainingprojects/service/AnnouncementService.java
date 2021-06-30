package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.Announcement;
import java.util.List;

/**
 * 公告表(Announcement)表服务接口
 *
 * @author makejava
 * @since 2021-06-29 20:08:27
 */
public interface AnnouncementService {

    /**
     * 通过ID查询单条数据
     *
     * @param announcementId 主键
     * @return 实例对象
     */
    Announcement queryById(Integer announcementId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Announcement> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param announcement 实例对象
     * @return 实例对象
     */
    Announcement insert(Announcement announcement);

    /**
     * 修改数据
     *
     * @param announcement 实例对象
     * @return 实例对象
     */
    Announcement update(Announcement announcement);

    /**
     * 通过主键删除数据
     *
     * @param announcementId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer announcementId);

}