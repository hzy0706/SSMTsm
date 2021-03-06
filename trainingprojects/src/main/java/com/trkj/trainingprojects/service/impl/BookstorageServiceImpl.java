package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.BookDao;
import com.trkj.trainingprojects.dao.BookstorageDao;
import com.trkj.trainingprojects.entity.Book;
import com.trkj.trainingprojects.service.BookstorageService;
import com.trkj.trainingprojects.service.StorageexpenditureService;
import com.trkj.trainingprojects.util.RandomNumber;
import com.trkj.trainingprojects.vo.BookVo;
import com.trkj.trainingprojects.vo.BookstorageVo;
import com.trkj.trainingprojects.vo.StorageexpenditureVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class BookstorageServiceImpl implements BookstorageService {
    @Resource
    private BookstorageDao bookstorageDao;

    @Resource
    private StorageexpenditureService storageexpenditureService;

    @Resource
    private BookDao bookDao;

    @Override
    @Transactional
    public void addBookstorage(BookstorageVo record) {
        bookstorageDao.insert(record);
    }

    @Override
    public BookstorageVo selectByBookstorageKey(Integer bookstorageId) {
        return bookstorageDao.selectByBookstorageKey(bookstorageId);
    }

    @Override
    public List<BookstorageVo> selectAllBookstorages(String value) {
        return bookstorageDao.selectAllBookstorages(value);
    }

    @Override
    public List<BookstorageVo> selectAllBookstoragesByStatus(int status,String value) {
        List<BookstorageVo> list = new ArrayList<>();
        switch (status){
            case 0:list=bookstorageDao.selectAllBookstoragesByStatus(0,0,"%"+value+"%");break;
            case 1:list=bookstorageDao.selectAllBookstoragesByStatus(1,0,"%"+value+"%");break;
            case 2:list=bookstorageDao.selectAllBookstoragesByStatus(1,1,"%"+value+"%");break;
            case 3:list=bookstorageDao.selectAllBookstorages("%"+value+"%");break;
        }
        return list;
    }

    @Override
    @Transactional
    public void updateByBookstorageKeySelective(BookstorageVo record) {
        bookstorageDao.updateByBookstorageKeySelective(record);
    }

    @Override
    @Transactional
    public void appBookstorage(BookstorageVo record) {
        record.setApproval(1);
        record.setApptime(new Date());
        bookstorageDao.appBookstorage(record);

        //????????????????????????????????????
        StorageexpenditureVo storageexpenditureVo = new StorageexpenditureVo();
        RandomNumber randomNumber  = new RandomNumber();
        storageexpenditureVo.setStorageNumber("RK"+randomNumber.getLocalTrmSeqNum());
        storageexpenditureVo.setBookId(record.getBookId());
        storageexpenditureVo.setBookstorageId(record.getBookstorageId());
        storageexpenditureVo.setStorageCount(record.getStoragecount());
        storageexpenditureVo.setTotalmoney(record.getTotalprice());
        storageexpenditureVo.setAddname(record.getAddname());
        BookVo bookVo = bookDao.selectByBookKey(record.getBookId());
        storageexpenditureVo.setRefundDetails("????????????"+bookVo.getBookname()+record.getStoragecount()+"???");
        storageexpenditureService.addStorageexpenditure(storageexpenditureVo);
    }

    @Override
    @Transactional
    public void deleteByBookstorageKey(BookstorageVo record) {
        bookstorageDao.updateByBookstorageKey(record);
    }
}
