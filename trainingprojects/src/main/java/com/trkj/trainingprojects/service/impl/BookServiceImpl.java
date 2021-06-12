package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.BookDao;
import com.trkj.trainingprojects.service.BookService;
import com.trkj.trainingprojects.vo.BookVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookDao bookDao;
    @Override
    @Transactional
    public int addBook(BookVo record) {
        return bookDao.insert(record);
    }

    @Override
    public List<BookVo> selectAllBooks(String value) {
        return bookDao.selectAllBooks("%"+value+"%");
    }

    @Override
    public List<BookVo> selectAllBooks2() {
        return bookDao.selectAllBooks2();
    }

    @Override
    public List<BookVo> selectAllBooksByCourseId(String value, Integer courseId) {
        return bookDao.selectAllBooksByCourseId("%"+value+"%",courseId);
    }

    @Override
    public BookVo selectByBookKey(Integer bookId) {
        return bookDao.selectByBookKey(bookId);
    }

    @Override
    @Transactional
    public int updateByBookKeySelective(BookVo record) {
        return bookDao.updateByBookKeySelective(record);
    }

    @Override
    @Transactional
    public int deleteByBookKey(BookVo record) {
        return bookDao.updateByBookKey(record);
    }
}
