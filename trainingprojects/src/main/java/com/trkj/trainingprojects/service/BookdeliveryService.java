package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.ArrVo;
import com.trkj.trainingprojects.vo.BookdeliveryVo;

import java.util.List;

public interface BookdeliveryService {
    void addBookdelivery(BookdeliveryVo record,List<ArrVo> list);


    BookdeliveryVo selectByBookdeliveryKey(Integer bookdeliveryId);

    List<BookdeliveryVo> selectAllBookdeliverysByState(Integer state,String value);

    int updateByBookdeliveryKeySelective(BookdeliveryVo record);

    int deleteByBookdeliveryKey(BookdeliveryVo record);

    int appBookdelivery(BookdeliveryVo bookdeliveryVo);

    int updateBookdeliveryApp(BookdeliveryVo bookdeliveryVo);
}
