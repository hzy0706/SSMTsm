package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.SuggestDao;
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
    public SuggestVo addSuggest(Integer suggestId) {
        return null;
    }

    @Override
    public SuggestVo selectSuggestById(SuggestVo suggestVo) {
        return null;
    }

    @Override
    public SuggestVo update(SuggestVo suggestVo) {
        return null;
    }

    @Override
    public List<SuggestVo> selectAll() {
        return dao.selectAll();
    }

    @Override
    public int delSuggestById(SuggestVo suggestVo) {
        return dao.delSuggestById(suggestVo);
    }
}
