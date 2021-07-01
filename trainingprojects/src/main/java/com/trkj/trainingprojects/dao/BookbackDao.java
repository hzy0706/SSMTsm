package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.BookbackVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BookbackDao {

    void insert(BookbackVo record);

    BookbackVo selectByBookbackKey(Integer bookbackId);

    List<BookbackVo> selectAllBookbacks();

    List<BookbackVo> selectAllBookBackByFind(Integer status,String value);

    void updateByBookbackKeySelective(BookbackVo record);

    void appBookback(BookbackVo record);

    void updateByBookbackKey(BookbackVo record);
}