package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.BookbackVo;

import java.util.List;

public interface BookbackService {
    void addBookback(BookbackVo record);

    BookbackVo selectByBookbackKey(Integer bookbackId);

    List<BookbackVo> selectAllBookbacks();

    List<BookbackVo> selectAllBookBackByFind(Integer status,String value);

    void updateByBookbackKeySelective(BookbackVo record);

    void appBookback(BookbackVo record);

    void deleteByBookbackKey(BookbackVo record);
}
