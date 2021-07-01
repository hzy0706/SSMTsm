package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.BookstorageVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BookstorageDao {

    void insert(BookstorageVo record);

    void insertSelective(BookstorageVo record);

    BookstorageVo selectByBookstorageKey(Integer bookstorageId);

    List<BookstorageVo> selectAllBookstorages(String value);

    List<BookstorageVo> selectAllBookstoragesByStatus(Integer approval,Integer cwapproval,String value);

    void updateByBookstorageKeySelective(BookstorageVo record);

    void appBookstorage(BookstorageVo record);

    void updateByBookstorageKey(BookstorageVo record);

    int updateByBookstorageApp(BookstorageVo record);
}