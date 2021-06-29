package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.dao.AdvancearrangeDao;
import com.trkj.trainingprojects.vo.AdvancearrangeVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AdvancearrangeServiceImpl implements AdvancearrangeService {
    @Resource
    private AdvancearrangeDao advancearrangeDao;
    @Override
    @Transactional
    public int addAdvancearrange(AdvancearrangeVo record) {
        return advancearrangeDao.addAdvancearrange(record);
    }

    @Override
    public List<AdvancearrangeVo> selectAllAdvancearrange() {
        return advancearrangeDao.selectAllAdvancearrange();
    }

    @Override
    @Transactional
    public int updateByAdvancearrangeKey(AdvancearrangeVo record) {
        return advancearrangeDao.updateByAdvancearrangeKey(record);
    }
}
