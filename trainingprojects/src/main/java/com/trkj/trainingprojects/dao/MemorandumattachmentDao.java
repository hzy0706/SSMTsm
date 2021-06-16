package com.trkj.trainingprojects.dao;


import com.trkj.trainingprojects.vo.MemorandumattachmentVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemorandumattachmentDao {
    int deleteByPrimaryKey(Integer memorandumattachmentId);

    int insert(MemorandumattachmentVo record);

    int insertSelective(MemorandumattachmentVo record);

    MemorandumattachmentVo selectByPrimaryKey(Integer memorandumattachmentId);

    int updateByMemorandumattachmentKey(MemorandumattachmentVo record);

    int delByMemorandumattachmentKey(MemorandumattachmentVo record);
//    查询
    List<MemorandumattachmentVo> findMemorandumattachment();

    int updateJwName(MemorandumattachmentVo memorandumattachmentVo);
    
    int updateJwChName(MemorandumattachmentVo memorandumattachmentVo);

    int updateZsName(MemorandumattachmentVo memorandumattachmentVo);
    //    撤销审核
    int updateZsChName(MemorandumattachmentVo memorandumattachmentVo);
}