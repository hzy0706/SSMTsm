package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.SuggestDao;
import com.trkj.trainingprojects.entity.Suggest;
import com.trkj.trainingprojects.service.SuggestService;
import com.trkj.trainingprojects.vo.SuggestVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SuggestServiceImpl implements SuggestService {
    @Resource
    private SuggestDao dao;
    @Override
    public Suggest queryById(Integer suggestId) {
        return null;
    }

    @Override
    public Suggest insert(Suggest suggest) {
        return null;
    }

    @Override
    public Suggest update(Suggest suggest) {
        return null;
    }

    @Override
    public List<SuggestVo> selectAll() {
        return dao.selectAll();
    }
}
