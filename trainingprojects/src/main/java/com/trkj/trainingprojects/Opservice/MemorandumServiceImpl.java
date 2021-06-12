package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.dao.MemorandumDao;
import com.trkj.trainingprojects.vo.MemorandumVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MemorandumServiceImpl implements MemorandumService {
    @Resource
    private MemorandumDao memorandumDao;
    @Override
    @Transactional
    public int addMemorandum(MemorandumVo record) {
        return memorandumDao.addMemorandum(record);
    }

    @Override
    public MemorandumVo selectByMemorandumKey(Integer memorandumId) {
        return memorandumDao.selectByMemorandumKey(memorandumId);
    }

    @Override
    @Transactional
    public int updateByMemorandumKeySelective(MemorandumVo record) {
        return memorandumDao.updateByMemorandumKeySelective(record);
    }

    @Override
    @Transactional
    public int deleteByMemorandumKey(MemorandumVo record) {
        return memorandumDao.updateByMemorandumKey(record);
    }

    @Override
    public List<MemorandumVo> selectByMemorandumEmpId(Integer empId) {
        return memorandumDao.selectByMemorandumEmpId(empId);
    }

    @Override
    public List<MemorandumVo> selectByMemorandums() {
        return memorandumDao.selectByMemorandums();
    }
}
