package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.vo.DeliveryddetailsVo;

public interface DeliveryddetailsService {
    int addDeliveryddetails(DeliveryddetailsVo record);

    int deleteByDeliveryddetailsKey(Integer deliveryddetailsId);

    DeliveryddetailsVo selectByDeliveryddetailsKey(Integer deliveryddetailsId);

    int updateByDeliveryddetailsKeySelective(DeliveryddetailsVo record);

    int updateByDeliveryddetailsKey(DeliveryddetailsVo record);
}
