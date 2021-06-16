package com.trkj.trainingprojects.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.dao.SourceDao;
import com.trkj.trainingprojects.service.SourceService;
import com.trkj.trainingprojects.vo.SourceVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class SourceServiceImpl implements SourceService {
    @Resource
    private SourceDao sourceDao;
    @Override
//    查询
    public PageInfo<SourceVo> selectAllSource(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize")int pagesize) {
        PageHelper.startPage(currentPage,pagesize);
        List<SourceVo> list=sourceDao.findSource();
        PageInfo<SourceVo> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }
//    增加
    @Override
    @Transactional
    public void addSource(SourceVo sourceVo){
        sourceDao.insert(sourceVo);
    }
//修改
    @Override
    @Transactional
    public void updateSource(SourceVo sourceVo){
        sourceDao.updateBySourceKey(sourceVo);
    }
    //删除
    @Override
    @Transactional
    public void delSource(SourceVo sourceVo){
        sourceDao.delBySourceKey(sourceVo);
    }
// 模糊查询
    @Override
    @Transactional
    public SourceVo mohuSource(Integer sourceId) {
        return sourceDao.mohuSource(sourceId);
    }
}
