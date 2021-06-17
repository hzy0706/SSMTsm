package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.DeliveryddetailsVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeliveryddetailsDao {

    int addDeliveryddetails(DeliveryddetailsVo record);

    int deleteByDeliveryddetailsKey(Integer deliveryddetailsId);

    DeliveryddetailsVo selectByDeliveryddetailsKey(Integer deliveryddetailsId);

    int updateByDeliveryddetailsKeySelective(DeliveryddetailsVo record);

    int updateByDeliveryddetailsKey(DeliveryddetailsVo record);
}