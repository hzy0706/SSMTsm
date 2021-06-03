package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.BookbackVo;

import java.util.List;

public interface BookbackService {
    int addBookback(BookbackVo record);

    BookbackVo selectByBookbackKey(Integer bookbackId);

    List<BookbackVo> selectAllBookbacks();

    int updateByBookbackKeySelective(BookbackVo record);

    int deleteByBookbackKey(BookbackVo record);
}
