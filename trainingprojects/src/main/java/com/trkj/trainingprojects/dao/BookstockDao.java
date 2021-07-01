package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.BookstockVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookstockDao {

    void addBookstock(BookstockVo record);

    BookstockVo selectByBookstockKey(Integer stockId);

    List<BookstockVo> selectByBookstockCheckedBy(Integer checkedBy);

    void updateByBookstockKeySelective(BookstockVo record);

    void updateByBookstockKey(BookstockVo record);

    void appByBookstockKey(BookstockVo bookstockVo);
}