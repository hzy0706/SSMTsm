package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.BookstockVo;

import java.util.List;

public interface BookstockService {
    int addBookstock(BookstockVo record);

    BookstockVo selectByBookstockKey(Integer stockId);

    List<BookstockVo> selectByBookstockCheckedBy(Integer checkedBy);

    int updateByBookstockKeySelective(BookstockVo record);

    int deleteByBookstockKey(BookstockVo record);

    void appByBookstockKey(BookstockVo bookstockVo);
}
