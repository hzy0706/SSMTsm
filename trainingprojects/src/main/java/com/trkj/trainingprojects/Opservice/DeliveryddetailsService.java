package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.vo.DeliveryddetailsVo;

import java.util.List;

public interface DeliveryddetailsService {
    int addDeliveryddetails(DeliveryddetailsVo record);

    int deleteByDeliveryddetailsKey(Integer bookdeliveryId);

    DeliveryddetailsVo selectByDeliveryddetailsKey(Integer deliveryddetailsId);

    List<DeliveryddetailsVo> selectDeliveryddetailsByBookDeliveryId(Integer id);

    int updateByDeliveryddetailsKeySelective(DeliveryddetailsVo record);

    int updateByDeliveryddetailsKey(DeliveryddetailsVo record);
}
