package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.BookdeliveryDao;
import com.trkj.trainingprojects.dao.BookstockDao;
import com.trkj.trainingprojects.dao.DeliveryddetailsDao;
import com.trkj.trainingprojects.service.BookdeliveryService;
import com.trkj.trainingprojects.util.RandomNumber;
import com.trkj.trainingprojects.vo.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Service
public class BookdeliveryServiceImpl implements BookdeliveryService {
    @Resource
    private BookdeliveryDao bookdeliveryDao;
    @Resource
    private DeliveryddetailsDao deliveryddetailsDao;
    @Resource
    private BookstockDao bookstockDao;
    @Override
    @Transactional
    public void addBookdelivery(BookdeliveryVo bookdeliveryVo,List<ArrVo> list) {
        //增加出库总表
        RandomNumber randomNumber = new RandomNumber();
        bookdeliveryVo.setSalenumber("CK"+randomNumber.getLocalTrmSeqNum());
        bookdeliveryDao.addBookdelivery(bookdeliveryVo);
        //增加出库详表
        for (ArrVo arrVo:list) {
            DeliveryddetailsVo deliveryddetailsVo = new DeliveryddetailsVo();
            deliveryddetailsVo.setStudentId(arrVo.getStudentId());
            deliveryddetailsVo.setBookId(arrVo.getBookId());
            deliveryddetailsVo.setDeliverycount(arrVo.getDeliverycount());
            deliveryddetailsVo.setBookdeliveryId(bookdeliveryVo.getBookdeliveryId());
            deliveryddetailsVo.setReceivablemoney(arrVo.getReceivablemoney());
            deliveryddetailsDao.addDeliveryddetails(deliveryddetailsVo);
        }
    }

    @Override
    public BookdeliveryVo selectByBookdeliveryKey(Integer bookdeliveryId) {
        return bookdeliveryDao.selectByBookdeliveryKey(bookdeliveryId);
    }

    @Override
    public List<BookdeliveryVo> selectAllBookdeliverysByState(Integer state, String value) {
        List<BookdeliveryVo> list = new ArrayList<>();
        switch (state){
            case 0:list=bookdeliveryDao.selectAllBookdeliverysByState(0,0,"%"+value+"%");break;
            case 1:list=bookdeliveryDao.selectAllBookdeliverysByState(1,0,"%"+value+"%");break;
            case 2:list=bookdeliveryDao.selectAllBookdeliverysByState(1,1,"%"+value+"%");break;
            case 3:list=bookdeliveryDao.selectAllBookdeliverys("%"+value+"%");break;
        }
        return list;
    }


    @Override
    @Transactional
    public void updateByBookdeliveryKeySelective(BookdeliveryVo record) {
        bookdeliveryDao.updateByBookdeliveryKeySelective(record);
    }

    @Override
    @Transactional
    public void deleteByBookdeliveryKey(BookdeliveryVo record) {
        //删除出库总表
        bookdeliveryDao.updateByBookdeliveryKey(record);
        //删除出库详细表
        deliveryddetailsDao.deleteByDeliveryddetailsKey(record.getBookdeliveryId());
    }

    @Override
    @Transactional
    public void appBookdelivery(BookdeliveryVo bookdeliveryVo) {
        //审核出库总表数据
        bookdeliveryDao.appBookdelivery(bookdeliveryVo);

        //添加财务模块教材出库收支表
        BookstockVo bookstockVo = new BookstockVo();
        bookstockVo.setBookdeliveryId(bookdeliveryVo.getBookdeliveryId());
        RandomNumber randomNumber = new RandomNumber();
        bookstockVo.setStockNumber("CK"+randomNumber.getLocalTrmSeqNum());
        bookstockVo.setAddname(bookdeliveryVo.getAddname());
        bookstockVo.setTotalmoney(bookdeliveryVo.getTotal());
        bookstockDao.addBookstock(bookstockVo);
    }

    @Override
    @Transactional
    public void updateBookdeliveryApp(BookdeliveryVo bookdeliveryVo) {
        bookdeliveryDao.updateBookdeliveryApp(bookdeliveryVo);
    }
}
