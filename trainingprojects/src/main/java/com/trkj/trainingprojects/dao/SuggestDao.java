package com.trkj.trainingprojects.dao;

<<<<<<< HEAD

import com.trkj.trainingprojects.vo.SuggestVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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
    SuggestVo queryById(Integer suggestId);

    /**
     * 新增数据
     *
     * @param suggest 实例对象
     * @return 影响行数
     */
    int addSuggest(SuggestVo suggest);

    /**
     * 修改数据
     *
     * @param suggest 实例对象
     * @return 影响行数
     */
    int update(SuggestVo suggest);
    /**
     * 查询所有
     */
    List<SuggestVo> selectAll();
=======
import com.trkj.trainingprojects.entity.Suggest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SuggestDao {
    int deleteByPrimaryKey(Integer suggestId);

    int insert(Suggest record);

    int insertSelective(Suggest record);

    Suggest selectByPrimaryKey(Integer suggestId);

    int updateByPrimaryKeySelective(Suggest record);

    int updateByPrimaryKey(Suggest record);
>>>>>>> c649abe70ff4d67687954119f8437cdbd1c9bc3e
}