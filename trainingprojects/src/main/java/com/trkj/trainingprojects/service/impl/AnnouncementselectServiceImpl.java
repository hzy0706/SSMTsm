package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.entity.Announcementselect;
import com.trkj.trainingprojects.dao.AnnouncementselectDao;
import com.trkj.trainingprojects.service.AnnouncementselectService;
import com.trkj.trainingprojects.vo.AnnouncementselectVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 公告允许查看表(Announcementselect)表服务实现类
 *
 * @author makejava
 * @since 2021-06-30 15:24:36
 */
@Service("announcementselectService")
public class AnnouncementselectServiceImpl implements AnnouncementselectService {
    @Resource
    private AnnouncementselectDao announcementselectDao;

    @Override
    public Announcementselect queryById(Integer announcementselectId) {
        return null;
    }

    @Override
    public List<Announcementselect> queryAllByLimit(int offset, int limit) {
        return null;
    }

    /**
     * 新增数据
     *
     * @param announcementselect 实例对象
     * @return 实例对象
     */
    @Override
    public Announcementselect insert(Announcementselect announcementselect) {
        this.announcementselectDao.insert(announcementselect);
        return announcementselect;
    }

    /**
     * 修改数据
     *
     * @param announcementselect 实例对象
     * @return 实例对象
     */
    @Override
    public Announcementselect update(Announcementselect announcementselect) {
        this.announcementselectDao.update(announcementselect);
        return this.queryById(announcementselect.getAnnouncementselectId());
    }

    /**
     * 通过主键删除数据
     *
     * @param announcementselectId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer announcementselectId) {
        return this.announcementselectDao.deleteById(announcementselectId) > 0;
    }

    @Override
    public List<AnnouncementselectVo> selectByEmpId(int empId) {
        return announcementselectDao.selectByEmpId(empId);
    }
}