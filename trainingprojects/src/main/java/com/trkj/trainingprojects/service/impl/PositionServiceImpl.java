package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.PositionDao;
import com.trkj.trainingprojects.entity.Position;
import com.trkj.trainingprojects.service.PositionService;
import com.trkj.trainingprojects.util.BeanCopyUtil;
import com.trkj.trainingprojects.vo.PositionVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PositionServiceImpl implements PositionService {
    @Resource
    private PositionDao positionDao;

    @Override
    @Transactional
    public int addPosition(PositionVo positionVo) {
        Position position = new Position();
        BeanCopyUtil.copyProperties(positionVo,position);
        return positionDao.insert(position);
    }

    @Override
    public PositionVo selectByPositionKey(Integer positionId) {
        PositionVo positionVo = new PositionVo();
        BeanCopyUtil.copyProperties(positionDao.selectByPositionKey(positionId),positionVo);
        return positionVo;
    }

    @Override
    public List<PositionVo> selectAllPositions() {
        return positionDao.selectAllPositions();
    }

    @Override
    @Transactional
    public int updateByPositionKeySelective(PositionVo positionVo) {
        Position position = new Position();
        BeanCopyUtil.copyProperties(positionVo,position);
        return positionDao.updateByPositionKeySelective(position);
    }

    @Override
    @Transactional
    public int deleteByPositionKey(PositionVo positionVo) {
        Position position = new Position();
        BeanCopyUtil.copyProperties(positionVo,position);
        return positionDao.updateByPositionKey(position);
    }
}
