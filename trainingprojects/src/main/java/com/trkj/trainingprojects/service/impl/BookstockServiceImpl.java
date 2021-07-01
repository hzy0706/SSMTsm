package com.trkj.trainingprojects.service.impl;
import com.trkj.trainingprojects.dao.BookDao;
import com.trkj.trainingprojects.dao.BookdeliveryDao;
import com.trkj.trainingprojects.dao.BookstockDao;
import com.trkj.trainingprojects.dao.DeliveryddetailsDao;
import com.trkj.trainingprojects.service.BookstockService;
import com.trkj.trainingprojects.vo.BookVo;
import com.trkj.trainingprojects.vo.BookdeliveryVo;
import com.trkj.trainingprojects.vo.BookstockVo;
import com.trkj.trainingprojects.vo.DeliveryddetailsVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BookstockServiceImpl implements BookstockService {
    @Resource
    private BookstockDao bookstockDao;
    @Resource
    private DeliveryddetailsDao deliveryddetailsDao;
    @Resource
    private BookDao bookDao;
    @Resource
    private BookdeliveryDao bookdeliveryDao;

    @Override
    @Transactional
    public void addBookstock(BookstockVo record) {
        bookstockDao.addBookstock(record);
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
    public void updateByBookstockKeySelective(BookstockVo record) {
        bookstockDao.updateByBookstockKeySelective(record);
    }

    @Override
    @Transactional
    public void deleteByBookstockKey(BookstockVo record) {
        bookstockDao.updateByBookstockKey(record);
    }

    @Override
    @Transactional
    public void appByBookstockKey(BookstockVo bookstockVo) {
        //审核财务模块支出记录
        bookstockDao.appByBookstockKey(bookstockVo);

        //修改后勤模块教材支出总表记录（财务是否审核）
        BookdeliveryVo bookdeliveryVo = bookdeliveryDao.selectByBookdeliveryKey(bookstockVo.getBookdeliveryId());
        bookdeliveryVo.setCwapproval(1);
        bookdeliveryDao.updateBookdeliveryApp(bookdeliveryVo);

        //修改教材库存
        List<DeliveryddetailsVo> deliveryddetailsVoList = deliveryddetailsDao.selectDeliveryddetailsByBookDeliveryId(bookstockVo.getBookdeliveryId());
        for (DeliveryddetailsVo deliveryddetailsVo:deliveryddetailsVoList){
            BookVo bookVo = bookDao.selectByBookKey(deliveryddetailsVo.getBookId());
            bookVo.setDeliverycount(bookVo.getDeliverycount()-deliveryddetailsVo.getDeliverycount());
            bookVo.setOutbound(bookVo.getOutbound()+deliveryddetailsVo.getDeliverycount());
            bookDao.updateBookCount(bookVo);
        }
    }
}
