package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.BookDao;
import com.trkj.trainingprojects.dao.BookstorageDao;
import com.trkj.trainingprojects.dao.StorageexpenditureDao;
import com.trkj.trainingprojects.entity.Bookstorage;
import com.trkj.trainingprojects.service.BookService;
import com.trkj.trainingprojects.service.BookstorageService;
import com.trkj.trainingprojects.service.StorageexpenditureService;
import com.trkj.trainingprojects.vo.BookVo;
import com.trkj.trainingprojects.vo.BookstorageVo;
import com.trkj.trainingprojects.vo.StorageexpenditureVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class StorageexpenditureServiceImpl implements StorageexpenditureService {
    @Resource
    private StorageexpenditureDao storageexpenditureDao;

    @Resource
    private BookDao bookDao;

    @Resource
    private BookstorageDao bookstorageDao;

    @Override
    @Transactional
    public void addStorageexpenditure(StorageexpenditureVo record) {
        storageexpenditureDao.addStorageexpenditure(record);
    }

    @Override
    public StorageexpenditureVo selectByStorageexpenditureKey(Integer storageexpenditureId) {
        return storageexpenditureDao.selectByStorageexpenditureKey(storageexpenditureId);
    }

    @Override
    public List<StorageexpenditureVo> selectByStorageexpenditureApproval(Integer approval) {
        return storageexpenditureDao.selectByStorageexpenditureApproval(approval);
    }

    @Override
    @Transactional
    public void updateByStorageexpenditureKeySelective(StorageexpenditureVo record) {
        storageexpenditureDao.updateByStorageexpenditureKeySelective(record);
    }

    @Override
    @Transactional
    public void deleteByStorageexpenditureKey(StorageexpenditureVo record) {
        storageexpenditureDao.updateByStorageexpenditureKey(record);
    }

    @Override
    @Transactional
    public void appStorageexpenditure(StorageexpenditureVo record) {
        //修改教材入库收支表
        record.setApptime(new Date());
        record.setApproval(1);
        storageexpenditureDao.updateByStorageexpenditureAppKey(record);

        //修改教材入库表
        BookstorageVo bookstorageVo = new BookstorageVo();
        bookstorageVo.setCwapproval(1);
        bookstorageVo.setBookstorageId(record.getBookstorageId());
        bookstorageDao.updateByBookstorageApp(bookstorageVo);

        //修改教材表
        BookVo bookVo = bookDao.selectByBookKey(record.getBookId());
        bookVo.setDeliverycount(bookVo.getDeliverycount()+record.getStorageCount());
        bookVo.setStorage(bookVo.getStorage()+record.getStorageCount());
        bookDao.updateBookCount(bookVo);
    }
}
