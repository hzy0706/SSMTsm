package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.BookbackVo;

import java.util.List;

public interface BookbackService {
    int addBookback(BookbackVo record);

    BookbackVo selectByBookbackKey(Integer bookbackId);

    List<BookbackVo> selectAllBookbacks();

    List<BookbackVo> selectAllBookBackByFind(Integer status,String value);

    int updateByBookbackKeySelective(BookbackVo record);

    void appBookback(BookbackVo record);

    int deleteByBookbackKey(BookbackVo record);
}
