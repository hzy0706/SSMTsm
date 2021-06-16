package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.ReturnvisitDao;
import com.trkj.trainingprojects.service.ReturnvisitService;
import com.trkj.trainingprojects.vo.ReturnvisitVo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReturnvisitServiceImpl implements ReturnvisitService {
    @Resource
    private ReturnvisitDao returnvisitDao;
    @Override
    public List<ReturnvisitVo> selectAllReturnvisit() {
        return returnvisitDao.findReturnvisit();
    }
//    增加
    @Override
    @Transactional
    public void addReturnvisit(ReturnvisitVo returnvisitVo){
        returnvisitDao.insert(returnvisitVo);
    }
//修改
    @Override
    @Transactional
    public int updateReturnvisit(ReturnvisitVo returnvisitVo) {
        return returnvisitDao.updateByReturnvisitKey(returnvisitVo);
    }
//删除
    @Override
    @Transactional
    public int delReturnVisit(ReturnvisitVo returnvisitVo) {
        return returnvisitDao.delByReturnvisitKey2(returnvisitVo)   ;
    }
}
