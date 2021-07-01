package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.BookstorageVo;
import java.util.List;


public interface BookstorageService {
    void addBookstorage(BookstorageVo record);

    BookstorageVo selectByBookstorageKey(Integer bookstorageId);

    List<BookstorageVo> selectAllBookstorages(String value);
    List<BookstorageVo> selectAllBookstoragesByStatus(int status,String value);

    void updateByBookstorageKeySelective(BookstorageVo record);

    void appBookstorage(BookstorageVo record);

    void deleteByBookstorageKey(BookstorageVo record);
}
