package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.ItemBank;
import com.trkj.trainingprojects.vo.ItemBankVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 考试题库表(ItemBank)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-02 12:54:41
 */
@Mapper
public interface ItemBankDao {

    ItemBank queryById(Integer itembankId);

    List<ItemBank> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<ItemBank> queryAll(ItemBank itembank);

    int insert(ItemBankVo itemBankVo);

    int insertBatch(@Param("entities") List<ItemBank> entities);

    int insertOrUpdateBatch(@Param("entities") List<ItemBank> entities);

    int updateByItemBankKey(ItemBankVo itemBankVo);

    int deleteById(Integer itembankId);

    List<ItemBankVo> selectAllItemBanks();
    int deleteByItemBank(ItemBankVo itemBankVo);
}

