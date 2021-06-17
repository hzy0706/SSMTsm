package com.trkj.trainingprojects.dao;


import com.trkj.trainingprojects.vo.BookdeliveryVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BookdeliveryDao {

    Long addBookdelivery(BookdeliveryVo record);

    BookdeliveryVo selectByBookdeliveryKey(Integer bookdeliveryId);

    List<BookdeliveryVo> selectAllBookdeliverys(String value);

    List<BookdeliveryVo> selectAllBookdeliverysByState(Integer Approval,Integer CWApproval,String value);

    int updateByBookdeliveryKeySelective(BookdeliveryVo record);

    int updateByBookdeliveryKey(BookdeliveryVo record);

    int appBookdelivery(BookdeliveryVo bookdeliveryVo);

    int updateBookdeliveryApp(BookdeliveryVo bookdeliveryVo);
}