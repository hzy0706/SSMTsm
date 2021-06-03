package com.trkj.trainingprojects.dao;


import com.trkj.trainingprojects.vo.BookdeliveryVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BookdeliveryDao {

    int addBookdelivery(BookdeliveryVo record);

    BookdeliveryVo selectByBookdeliveryKey(Integer bookdeliveryId);

    List<BookdeliveryVo> selectAllBookdeliverys();

    int updateByBookdeliveryKeySelective(BookdeliveryVo record);

    int updateByBookdeliveryKey(BookdeliveryVo record);
}