package com.trkj.trainingprojects.dao;


import com.trkj.trainingprojects.vo.RefundVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface RefundDao {
    int deleteByRefundKey(Integer refundId);

    int addRefund(RefundVo record);

    int insertSelective(RefundVo record);

    RefundVo selectByRefundKey(Integer refundId);

    int updateByRefundKey(RefundVo record);

    int deleteByRefundKey(RefundVo record);

    List<RefundVo> findRefund();



}