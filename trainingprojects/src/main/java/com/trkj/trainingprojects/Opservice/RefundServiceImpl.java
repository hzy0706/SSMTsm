package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.dao.RefundDao;
import com.trkj.trainingprojects.vo.RefundVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class RefundServiceImpl implements RefundService {
    @Resource
    private RefundDao refundDao;
    @Override
    public List<RefundVo> findRefund() {
        return refundDao.findRefund();
    }

    @Override
    @Transactional
    public void addRefund(RefundVo refundVo) {
        refundDao.addRefund(refundVo);
}

    @Override
    @Transactional
    public int updateRefund(RefundVo refundVo) {
        return refundDao.updateByRefundKey(refundVo);
    }

    @Override
    @Transactional
    public int deleteRefund(RefundVo refundVo) {
        return refundDao.deleteByRefundKey(refundVo);
    }
}
