package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.dao.DeliveryddetailsDao;
import com.trkj.trainingprojects.vo.DeliveryddetailsVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

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
    public int deleteByDeliveryddetailsKey(Integer bookdeliveryId) {
        return deliveryddetailsDao.deleteByDeliveryddetailsKey(bookdeliveryId);
    }

    @Override
    public DeliveryddetailsVo selectByDeliveryddetailsKey(Integer deliveryddetailsId) {
        return deliveryddetailsDao.selectByDeliveryddetailsKey(deliveryddetailsId);
    }

    @Override
    public List<DeliveryddetailsVo> selectDeliveryddetailsByBookDeliveryId(Integer id) {
        return deliveryddetailsDao.selectDeliveryddetailsByBookDeliveryId(id);
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
