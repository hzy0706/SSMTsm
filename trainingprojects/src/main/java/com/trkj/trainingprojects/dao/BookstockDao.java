package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.BookstockVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookstockDao {

    int addBookstock(BookstockVo record);

    BookstockVo selectByBookstockKey(Integer stockId);

    List<BookstockVo> selectByBookstockCheckedBy(Integer checkedBy);

    int updateByBookstockKeySelective(BookstockVo record);

    int updateByBookstockKey(BookstockVo record);
}