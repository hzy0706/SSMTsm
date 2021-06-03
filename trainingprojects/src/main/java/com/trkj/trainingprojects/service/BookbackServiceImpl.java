package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.dao.BookbackDao;
import com.trkj.trainingprojects.vo.BookbackVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BookbackServiceImpl implements BookbackService {
    @Resource
    private BookbackDao bookbackDao;
    @Override
    @Transactional
    public int addBookback(BookbackVo record) {
        return bookbackDao.insert(record);
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
    @Transactional
    public int updateByBookbackKeySelective(BookbackVo record) {
        return bookbackDao.updateByBookbackKeySelective(record);
    }

    @Override
    @Transactional
    public int deleteByBookbackKey(BookbackVo record) {
        return bookbackDao.updateByBookbackKey(record);
    }
}
