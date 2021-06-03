package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.BookVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BookDao {
    int deleteByBookKey(Integer bookId);

    int insert(BookVo record);

    int insertSelective(BookVo record);

    BookVo selectByBookKey(Integer bookId);

    List<BookVo> selectAllBooks();

    int updateByBookKeySelective(BookVo record);

    int updateByBookKey(BookVo record);
}