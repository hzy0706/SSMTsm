package com.trkj.trainingprojects.dao;



import com.trkj.trainingprojects.vo.SessionVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 年届表(Session)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-02 18:52:09
 */
@Mapper
public interface SessionDao {

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
     * @param
     * @return 影响行数
     */
    int addSession(SessionVo sessionVo);

    /**
     * 修改数据
     *
     * @param
     * @return 影响行数
     */
    int update(SessionVo sessionVo);

    /**
     * 通过主键删除数据
     *
     * @param sessionId 主键
     * @return 影响行数
     */

    /**
     * 查询所有
     *

     * @return 对象列表
     */
    List<SessionVo> selectAll();
    /**
     *
     */
    int delSessionById(SessionVo sessionVo);
}