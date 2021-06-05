package com.trkj.trainingprojects.service;
import com.trkj.trainingprojects.dao.BookstockDao;
import com.trkj.trainingprojects.vo.BookstockVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BookstockServiceImpl implements BookstockService {
    @Resource
    private BookstockDao bookstockDao;
    @Override
    @Transactional
    public int addBookstock(BookstockVo record) {
        return bookstockDao.addBookstock(record);
    }

    @Override
    public BookstockVo selectByBookstockKey(Integer stockId) {
        return bookstockDao.selectByBookstockKey(stockId);
    }

    @Override
    public List<BookstockVo> selectByBookstockCheckedBy(Integer checkedBy) {
        return bookstockDao.selectByBookstockCheckedBy(checkedBy);
    }

    @Override
    @Transactional
    public int updateByBookstockKeySelective(BookstockVo record) {
        return bookstockDao.updateByBookstockKeySelective(record);
    }

    @Override
    @Transactional
    public int deleteByBookstockKey(BookstockVo record) {
        return bookstockDao.updateByBookstockKey(record);
    }
}
