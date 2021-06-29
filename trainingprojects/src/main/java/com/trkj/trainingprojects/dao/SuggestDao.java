package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.SuggestVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 意见箱表(Suggest)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-04 17:11:12
 */
@Mapper
public interface SuggestDao {


    /**
     * 通过ID查询单条数据
     *
     * @param suggestId 主键
     * @return 实例对象
     */
    SuggestVo selectSuggestById(Integer suggestId);

    /**
     * 新增数据
     *
     * @param
     * @return 影响行数
     */
    void addSuggest(SuggestVo suggestVo);

    /**
     * 修改数据
     *
     * @param
     * @return 影响行数
     */
    int updateSuggest(SuggestVo suggestVo);

    /**
     * 查询所有
     */
    List<SuggestVo> selectAll();

    /**
     * 根据id删除
     * @param suggestVo
     * @return
     */
    int delSuggestById(SuggestVo suggestVo);
}


