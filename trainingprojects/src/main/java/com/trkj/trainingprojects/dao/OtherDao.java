package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.Other;
import com.trkj.trainingprojects.vo.OtherVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 其他开销表(Other)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-24 14:09:08
 */
@Mapper
public interface OtherDao {
    /**
     *查询所有
     * @return
     */
     List<OtherVo> selectOtherAll();

    /**
     * 新增
     * @param otherVo
     * @return
     */
     int addOther(OtherVo otherVo);

    /**
     * 根据id删除
     * @param otherVo
     * @return
     */
     int delOtherById(OtherVo otherVo);
}