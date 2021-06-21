package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.entity.Unittype;
import com.trkj.trainingprojects.dao.UnittypeDao;
import com.trkj.trainingprojects.service.UnittypeService;
import com.trkj.trainingprojects.vo.UnittypeVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 单位类型表(Unittype)表服务实现类
 *
 * @author makejava
 * @since 2021-06-21 14:09:19
 */
@Service("unittypeService")
public class UnittypeServiceImpl implements UnittypeService {
    @Resource
    private UnittypeDao unittypeDao;


    @Override
    public List<UnittypeVo> selectAllUnitType() {
        return unittypeDao.selectAllUnitType();
    }

    @Override
    public int addUnitType(UnittypeVo unittypeVo) {
        return 0;
    }

    @Override
    public int delUnitTypeById(Integer unittypeId) {
        return 0;
    }
}