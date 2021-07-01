package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.BookVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BookDao {
    void deleteByBookKey(Integer bookId);

    void insert(BookVo record);

    void insertSelective(BookVo record);

    BookVo selectByBookKey(Integer bookId);

    List<BookVo> selectAllBooks(String value);
    List<BookVo> selectAllBooksByCourseId(String value,Integer courseId);

    List<BookVo> selectAllBooks2();

    List<BookVo> selectAllBooks3();

    void updateByBookKeySelective(BookVo record);

    void updateByBookKey(BookVo record);

    void updateBookCount(BookVo record);
}