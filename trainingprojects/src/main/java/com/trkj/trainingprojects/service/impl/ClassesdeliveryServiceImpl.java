package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.BookDao;
import com.trkj.trainingprojects.dao.ClassesdeliveryDao;
import com.trkj.trainingprojects.service.BookService;
import com.trkj.trainingprojects.service.ClassesdeliveryService;
import com.trkj.trainingprojects.util.RandomNumber;
import com.trkj.trainingprojects.vo.BookVo;
import com.trkj.trainingprojects.vo.ClassesdeliveryVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@Service
public class ClassesdeliveryServiceImpl implements ClassesdeliveryService {
    @Resource
    private ClassesdeliveryDao classesdeliveryDao;
    @Resource
    private BookDao bookDao;
    @Resource
    private BookService bookService;
    @Override
    @Transactional
    public int addClassesdelivery(ClassesdeliveryVo record) {
        BookVo bookVo = bookDao.selectByBookKey(record.getBookId());
        RandomNumber randomNumber  = new RandomNumber();
        record.setSalenumber("CK"+randomNumber.getLocalTrmSeqNum());
        record.setDeliverytype("新班开班支出");
        BigDecimal count = new BigDecimal(record.getClassesdeliveryCount());
        record.setTotal(count.multiply(bookVo.getBooksprice()));
        classesdeliveryDao.addClassesdelivery(record);
        return 0;
    }

    @Override
    public ClassesdeliveryVo selectByClassesdeliveryKey(Integer classesdeliveryId) {
        return classesdeliveryDao.selectByClassesdeliveryKey(classesdeliveryId);
    }

    @Override
    public List<ClassesdeliveryVo> selectAllClassesdeliverys(Integer approval, String value) {
        return classesdeliveryDao.selectAllClassesdeliverys(approval,value);
    }

    @Override
    @Transactional
    public int updateByClassesdeliveryKeySelective(ClassesdeliveryVo record) {
        BookVo bookVo = bookDao.selectByBookKey(record.getBookId());
        BigDecimal count = new BigDecimal(record.getClassesdeliveryCount());
        record.setTotal(count.multiply(bookVo.getBooksprice()));
        return classesdeliveryDao.updateByClassesdeliveryKeySelective(record);
    }

    @Override
    @Transactional
    public int deleteByClassesdeliveryKey(ClassesdeliveryVo record) {
        return classesdeliveryDao.updateByClassesdeliveryKey(record);
    }

    @Override
    @Transactional
    public void appByClassesdeliveryKey(ClassesdeliveryVo record) {
        //修改教材表数据
        BookVo bookVo = bookDao.selectByBookKey(record.getBookId());
        bookVo.setDeliverycount(bookVo.getDeliverycount()-record.getClassesdeliveryCount());
        bookVo.setOutbound(bookVo.getOutbound()+record.getClassesdeliveryCount());
        bookDao.updateBookCount(bookVo);
        //修改出库表数据
        classesdeliveryDao.appByClassesdeliveryKey(record);
    }
}
