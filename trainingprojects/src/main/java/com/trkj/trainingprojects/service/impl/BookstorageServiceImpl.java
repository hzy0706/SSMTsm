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
    public int addBookstorage(BookstorageVo record) {
        return bookstorageDao.insert(record);
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
    public int updateByBookstorageKeySelective(BookstorageVo record) {
        return bookstorageDao.updateByBookstorageKeySelective(record);
    }

    @Override
    @Transactional
    public void appBookstorage(BookstorageVo record) {
        record.setApproval(1);
        record.setApptime(new Date());
        bookstorageDao.appBookstorage(record);

        //生成财务模块教材入库记录
        StorageexpenditureVo storageexpenditureVo = new StorageexpenditureVo();
        RandomNumber randomNumber  = new RandomNumber();
        storageexpenditureVo.setStorageNumber("RK"+randomNumber.getLocalTrmSeqNum());
        storageexpenditureVo.setBookId(record.getBookId());
        storageexpenditureVo.setBookstorageId(record.getBookstorageId());
        storageexpenditureVo.setStorageCount(record.getStoragecount());
        storageexpenditureVo.setTotalmoney(record.getTotalprice());
        storageexpenditureVo.setAddname(record.getAddname());
        BookVo bookVo = bookDao.selectByBookKey(record.getBookId());
        storageexpenditureVo.setRefundDetails("入库教材"+bookVo.getBookname()+record.getStoragecount()+"本");
        storageexpenditureService.addStorageexpenditure(storageexpenditureVo);
    }

    @Override
    @Transactional
    public int deleteByBookstorageKey(BookstorageVo record) {
        return bookstorageDao.updateByBookstorageKey(record);
    }
}
