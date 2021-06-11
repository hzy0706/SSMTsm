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
