package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.DeliveryddetailsVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeliveryddetailsDao {

    int addDeliveryddetails(DeliveryddetailsVo record);

    int deleteByDeliveryddetailsKey(Integer bookdeliveryId);

    DeliveryddetailsVo selectByDeliveryddetailsKey(Integer deliveryddetailsId);

    List<DeliveryddetailsVo> selectDeliveryddetailsByBookDeliveryId(Integer id);

    int updateByDeliveryddetailsKeySelective(DeliveryddetailsVo record);

    int updateByDeliveryddetailsKey(DeliveryddetailsVo record);
}