package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.entity.Announcement;
import com.trkj.trainingprojects.dao.AnnouncementDao;
import com.trkj.trainingprojects.service.AnnouncementService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 公告表(Announcement)表服务实现类
 *
 * @author makejava
 * @since 2021-06-29 20:08:27
 */
@Service("announcementService")
public class AnnouncementServiceImpl implements AnnouncementService {
    @Resource
    private AnnouncementDao announcementDao;

    /**
     * 通过ID查询单条数据
     *
     * @param announcementId 主键
     * @return 实例对象
     */
    @Override
    public Announcement queryById(Integer announcementId) {
        return this.announcementDao.queryById(announcementId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Announcement> queryAllByLimit(int offset, int limit) {
        return this.announcementDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param announcement 实例对象
     * @return 实例对象
     */
    @Override
    public Announcement insert(Announcement announcement) {
        this.announcementDao.insert(announcement);
        return announcement;
    }

    /**
     * 修改数据
     *
     * @param announcement 实例对象
     * @return 实例对象
     */
    @Override
    public Announcement update(Announcement announcement) {
        this.announcementDao.update(announcement);
        return this.queryById(announcement.getAnnouncementId());
    }

    /**
     * 通过主键删除数据
     *
     * @param announcementId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer announcementId) {
        return this.announcementDao.deleteById(announcementId) > 0;
    }
}