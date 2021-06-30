package com.trkj.trainingprojects.service;


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
     * @param
     * @return 实例对象
     */
    void addSuggest(SuggestVo suggestVo);


    /**
     * 新增数据
     *
     * @param suggestVo 实例对象
     * @return 实例对象
     */
    SuggestVo selectSuggestById(SuggestVo suggestVo);

    /**
     * 修改数据
     *
     * @param suggestVo 实例对象
     * @return 实例对象
     */
    int updateSuggest(SuggestVo suggestVo);


    /**
     * 查询所有
     */
    List<SuggestVo> selectAll();
    /**
     * 删除
     */
    int delSuggestById(SuggestVo suggestVo);
}