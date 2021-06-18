package com.trkj.trainingprojects.service;


import com.trkj.trainingprojects.vo.SessionVo;

import java.util.List;

/**
 * 年届表(Session)表服务接口
 *
 * @author makejava
 * @since 2021-06-02 18:52:09
 */
public interface SessionService {

    /**
     * 通过ID查询单条数据
     *
     * @param sessionId 主键
     * @return 实例对象
     */
    SessionVo selectById(Integer sessionId);


    /**
     * 新增数据
     *
     * @param session 实例对象
     * @return 实例对象
     */
    public void addSession(SessionVo session);

    /**
     * 修改数据
     *
     * @param session 实例对象
     * @return 实例对象
     */
    int update(SessionVo session);

    /**
     * 查询所有
     *

     * @return 对象列表
     */
    List<SessionVo> selectAllSession();

    /**
     * 根据id删除
     * @param
     * @return
     */
    int delSessionById(SessionVo sessionVo);
}