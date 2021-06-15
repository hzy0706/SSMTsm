package com.trkj.trainingprojects.service;

import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.vo.SourceVo;

public interface SourceService {
//    查询
    public PageInfo<SourceVo> selectAllSource(int currentPage, int pagesize);
//    增加
    public void addSource(SourceVo sourceVo);
//    修改
    public void updateSource(SourceVo sourceVo);
//    删除
    public void delSource(SourceVo sourceVo);
//    模糊查询
    public SourceVo mohuSource(Integer sourceId);
}
