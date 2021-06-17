package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.dao.DeliveryddetailsDao;
import com.trkj.trainingprojects.vo.DeliveryddetailsVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class DeliveryddetailsServiceImpl implements DeliveryddetailsService {
    @Resource
    private DeliveryddetailsDao deliveryddetailsDao;

    @Override
    @Transactional
    public int addDeliveryddetails(DeliveryddetailsVo record) {
        return deliveryddetailsDao.addDeliveryddetails(record);
    }

    @Override
    @Transactional
    public int deleteByDeliveryddetailsKey(Integer deliveryddetailsId) {
        return deliveryddetailsDao.deleteByDeliveryddetailsKey(deliveryddetailsId);
    }

    @Override
    public DeliveryddetailsVo selectByDeliveryddetailsKey(Integer deliveryddetailsId) {
        return deliveryddetailsDao.selectByDeliveryddetailsKey(deliveryddetailsId);
    }

    @Override
    @Transactional
    public int updateByDeliveryddetailsKeySelective(DeliveryddetailsVo record) {
        return deliveryddetailsDao.updateByDeliveryddetailsKeySelective(record);
    }

    @Override
    @Transactional
    public int updateByDeliveryddetailsKey(DeliveryddetailsVo record) {
        return deliveryddetailsDao.updateByDeliveryddetailsKey(record);
    }
}
