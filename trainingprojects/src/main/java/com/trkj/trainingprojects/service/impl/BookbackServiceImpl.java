package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.BookDao;
import com.trkj.trainingprojects.dao.BookbackDao;
import com.trkj.trainingprojects.service.BookbackService;
import com.trkj.trainingprojects.vo.BookVo;
import com.trkj.trainingprojects.vo.BookbackVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class BookbackServiceImpl implements BookbackService {
    @Resource
    private BookbackDao bookbackDao;
    @Resource
    private BookDao bookDao;

    @Override
    @Transactional
    public void addBookback(BookbackVo record) {
        bookbackDao.insert(record);
    }

    @Override
    public BookbackVo selectByBookbackKey(Integer bookbackId) {
        return bookbackDao.selectByBookbackKey(bookbackId);
    }

    @Override
    public List<BookbackVo> selectAllBookbacks() {
        return bookbackDao.selectAllBookbacks();
    }

    @Override
    public List<BookbackVo> selectAllBookBackByFind(Integer status, String value) {
        return bookbackDao.selectAllBookBackByFind(status,value);
    }

    @Override
    @Transactional
    public void updateByBookbackKeySelective(BookbackVo record) {
        bookbackDao.updateByBookbackKeySelective(record);
    }

    @Override
    @Transactional
    public void appBookback(BookbackVo record) {
        //修改破损记录数据
        record.setApptime(new Date());
        record.setApproval(1);
        bookbackDao.appBookback(record);

        //修改教材库存
        BookVo bookVo = bookDao.selectByBookKey(record.getBookId());
        bookVo.setDeliverycount(bookVo.getDeliverycount()-record.getBookbackCount());
        bookVo.setDamage(bookVo.getDamage()+record.getBookbackCount());
        bookDao.updateBookCount(bookVo);
    }

    @Override
    @Transactional
    public void deleteByBookbackKey(BookbackVo record) {
        bookbackDao.updateByBookbackKey(record);
    }
}
