package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.BookdeliveryVo;

import java.util.List;

public interface BookdeliveryService {
    int addBookdelivery(BookdeliveryVo record);


    BookdeliveryVo selectByBookdeliveryKey(Integer bookdeliveryId);

    List<BookdeliveryVo> selectAllBookdeliverys();

    int updateByBookdeliveryKeySelective(BookdeliveryVo record);

    int deleteByBookdeliveryKey(BookdeliveryVo record);
}
