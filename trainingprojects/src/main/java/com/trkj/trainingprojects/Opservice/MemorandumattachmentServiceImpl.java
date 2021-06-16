package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.dao.MemorandumattachmentDao;
import com.trkj.trainingprojects.vo.MemorandumattachmentVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MemorandumattachmentServiceImpl implements MemorandumattachmentService {
    @Resource
    private MemorandumattachmentDao memorandumattachmentDao;

    //    查询
    @Override
    public List<MemorandumattachmentVo> selectAllMemorandumattachment() {
        return memorandumattachmentDao.findMemorandumattachment();
    }

    //    增加
    @Override
    @Transactional
    public void addMemorandumattachment(MemorandumattachmentVo memorandumattachmentVo) {
        memorandumattachmentDao.insert(memorandumattachmentVo);

    }
//    修改
    @Override
    @Transactional
    public int updateMemorandumattachment(MemorandumattachmentVo memorandumattachmentVo) {
        return memorandumattachmentDao.updateByMemorandumattachmentKey(memorandumattachmentVo);
    }
//    删除
    @Override
    @Transactional
    public int delMemorandumattachment(MemorandumattachmentVo memorandumattachmentVo) {
        return memorandumattachmentDao.delByMemorandumattachmentKey(memorandumattachmentVo);
    }

    @Override
    public int updateJwName(MemorandumattachmentVo memorandumattachmentVo) {
        return memorandumattachmentDao.updateJwName(memorandumattachmentVo);
    }
}
