package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.Suggest;
import com.trkj.trainingprojects.vo.SuggestVo;

import java.util.List;

/**
 * 意见箱表(Suggest)表服务接口
 *
 * @author makejava
 * @since 2021-06-04 17:11:12
 */
public interface SuggestService {

    /**
     * 通过ID查询单条数据
     *
     * @param suggestId 主键
     * @return 实例对象
     */
    Suggest queryById(Integer suggestId);


    /**
     * 新增数据
     *
     * @param suggest 实例对象
     * @return 实例对象
     */
    Suggest insert(Suggest suggest);

    /**
     * 修改数据
     *
     * @param suggest 实例对象
     * @return 实例对象
     */
    Suggest update(Suggest suggest);


    /**
     * 查询所有
     */
    List<SuggestVo> selectAll();
}