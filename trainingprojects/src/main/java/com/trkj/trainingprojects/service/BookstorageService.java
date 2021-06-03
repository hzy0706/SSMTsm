package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.BookstorageVo;
import java.util.List;


public interface BookstorageService {
    int addBookstorage(BookstorageVo record);

    BookstorageVo selectByBookstorageKey(Integer bookstorageId);

    List<BookstorageVo> selectAllBookstorages();

    int updateByBookstorageKeySelective(BookstorageVo record);

    int deleteByBookstorageKey(BookstorageVo record);
}
