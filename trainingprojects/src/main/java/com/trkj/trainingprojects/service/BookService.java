package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.BookVo;
import com.trkj.trainingprojects.vo.EmpVo;

import java.util.List;

public interface BookService {
    int addBook(BookVo record);
    List<BookVo> selectAllBooks(String value);
    List<BookVo> selectAllBooks2();
    List<BookVo> selectAllBooks3();
    List<BookVo> selectAllBooksByCourseId(String value,Integer courseId);
    BookVo selectByBookKey(Integer bookId);
    int updateByBookKeySelective(BookVo record);
    int deleteByBookKey(BookVo record);

}
