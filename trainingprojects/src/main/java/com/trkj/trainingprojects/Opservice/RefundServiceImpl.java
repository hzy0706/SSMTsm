package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.dao.RefundDao;
import com.trkj.trainingprojects.vo.RefundVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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
}
