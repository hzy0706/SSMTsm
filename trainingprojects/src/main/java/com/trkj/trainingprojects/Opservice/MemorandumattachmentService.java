package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.vo.MemorandumattachmentVo;

import java.util.List;

public interface MemorandumattachmentService {
//    查询
    public List<MemorandumattachmentVo> selectAllMemorandumattachment();
//    增加
    public void addMemorandumattachment(MemorandumattachmentVo memorandumattachmentVo);
//    修改
    public int updateMemorandumattachment(MemorandumattachmentVo memorandumattachmentVo);
//    删除
    public int delMemorandumattachment(MemorandumattachmentVo memorandumattachmentVo);
    //根据id修改教务的
    public int updateJwName(MemorandumattachmentVo memorandumattachmentVo);
}
