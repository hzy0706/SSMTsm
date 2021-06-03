package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.BookVo;
import com.trkj.trainingprojects.vo.EmpVo;

import java.util.List;

public interface BookService {
    int addBook(BookVo record);
    List<BookVo> selectAllBooks();
    BookVo selectByBookKey(Integer bookId);
    int updateByBookKeySelective(BookVo record);
    int deleteByBookKey(BookVo record);

}
