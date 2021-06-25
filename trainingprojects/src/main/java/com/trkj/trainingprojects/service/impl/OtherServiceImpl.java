package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.entity.Other;
import com.trkj.trainingprojects.dao.OtherDao;
import com.trkj.trainingprojects.service.OtherService;
import com.trkj.trainingprojects.vo.OtherVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 其他开销表(Other)表服务实现类
 *
 * @author makejava
 * @since 2021-06-24 14:09:08
 */
@Service("otherService")
public class OtherServiceImpl implements OtherService {
    @Resource
    private OtherDao otherDao;


    @Override
    public List<OtherVo> selectOtherAll() {
        return otherDao.selectOtherAll();
    }

    @Override
    @Transactional
    public int addOther(OtherVo otherVo) {
        return otherDao.addOther(otherVo);
    }

    @Override
    @Transactional
    public int delOtherById(OtherVo otherVo) {
        return otherDao.delOtherById(otherVo);
    }
}