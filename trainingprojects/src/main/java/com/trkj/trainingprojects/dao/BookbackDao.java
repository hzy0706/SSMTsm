package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.BookbackVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BookbackDao {

    int insert(BookbackVo record);

    BookbackVo selectByBookbackKey(Integer bookbackId);

    List<BookbackVo> selectAllBookbacks();

    int updateByBookbackKeySelective(BookbackVo record);

    int updateByBookbackKey(BookbackVo record);
}