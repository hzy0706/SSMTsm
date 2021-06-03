package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.BookstorageVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BookstorageDao {

    int insert(BookstorageVo record);

    int insertSelective(BookstorageVo record);

    BookstorageVo selectByBookstorageKey(Integer bookstorageId);

    List<BookstorageVo> selectAllBookstorages();

    int updateByBookstorageKeySelective(BookstorageVo record);

    int updateByBookstorageKey(BookstorageVo record);
}