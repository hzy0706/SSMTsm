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

    void updateByBookdeliveryKeySelective(BookdeliveryVo record);

    void updateByBookdeliveryKey(BookdeliveryVo record);

    void appBookdelivery(BookdeliveryVo bookdeliveryVo);

    void updateBookdeliveryApp(BookdeliveryVo bookdeliveryVo);
}