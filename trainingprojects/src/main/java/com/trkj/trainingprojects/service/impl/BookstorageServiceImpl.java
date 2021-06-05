package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.BookstorageDao;
import com.trkj.trainingprojects.service.BookstorageService;
import com.trkj.trainingprojects.vo.BookstorageVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BookstorageServiceImpl implements BookstorageService {
    @Resource
    private BookstorageDao bookstorageDao;

    @Override
    @Transactional
    public int addBookstorage(BookstorageVo record) {
        return bookstorageDao.insert(record);
    }

    @Override
    public BookstorageVo selectByBookstorageKey(Integer bookstorageId) {
        return bookstorageDao.selectByBookstorageKey(bookstorageId);
    }

    @Override
    public List<BookstorageVo> selectAllBookstorages() {
        return bookstorageDao.selectAllBookstorages();
    }

    @Override
    @Transactional
    public int updateByBookstorageKeySelective(BookstorageVo record) {
        return bookstorageDao.updateByBookstorageKeySelective(record);
    }

    @Override
    @Transactional
    public int deleteByBookstorageKey(BookstorageVo record) {
        return bookstorageDao.updateByBookstorageKey(record);
    }
}
