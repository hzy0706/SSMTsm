package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.vo.RefundVo;

import java.util.List;

public interface RefundService {
    public List<RefundVo> findRefund();
    public void addRefund(RefundVo refundVo);
    public int updateRefund(RefundVo refundVo);
    public int deleteRefund(RefundVo refundVo);
}
