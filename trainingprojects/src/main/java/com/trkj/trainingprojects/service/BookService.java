package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.BookVo;
import com.trkj.trainingprojects.vo.EmpVo;

import java.util.List;

public interface BookService {
    void addBook(BookVo record);
    List<BookVo> selectAllBooks(String value);
    List<BookVo> selectAllBooks2();
    List<BookVo> selectAllBooks3();
    List<BookVo> selectAllBooksByCourseId(String value,Integer courseId);
    BookVo selectByBookKey(Integer bookId);
    void updateByBookKeySelective(BookVo record);
    void deleteByBookKey(BookVo record);

}
