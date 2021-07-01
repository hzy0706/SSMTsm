package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.BookstockVo;

import java.util.List;

public interface BookstockService {
    void addBookstock(BookstockVo record);

    BookstockVo selectByBookstockKey(Integer stockId);

    List<BookstockVo> selectByBookstockCheckedBy(Integer checkedBy);

    void updateByBookstockKeySelective(BookstockVo record);

    void deleteByBookstockKey(BookstockVo record);

    void appByBookstockKey(BookstockVo bookstockVo);
}
