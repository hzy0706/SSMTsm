package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.BookdeliveryDao;
import com.trkj.trainingprojects.service.BookdeliveryService;
import com.trkj.trainingprojects.vo.BookdeliveryVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BookdeliveryServiceImpl implements BookdeliveryService {
    @Resource
    private BookdeliveryDao bookdeliveryDao;

    @Override
    @Transactional
    public int addBookdelivery(BookdeliveryVo record) {
        return bookdeliveryDao.addBookdelivery(record);
    }

    @Override
    public BookdeliveryVo selectByBookdeliveryKey(Integer bookdeliveryId) {
        return bookdeliveryDao.selectByBookdeliveryKey(bookdeliveryId);
    }

    @Override
    public List<BookdeliveryVo> selectAllBookdeliverys() {
        return bookdeliveryDao.selectAllBookdeliverys();
    }

    @Override
    public int updateByBookdeliveryKeySelective(BookdeliveryVo record) {
        return bookdeliveryDao.updateByBookdeliveryKeySelective(record);
    }

    @Override
    public int deleteByBookdeliveryKey(BookdeliveryVo record) {
        return bookdeliveryDao.updateByBookdeliveryKey(record);
    }
}
