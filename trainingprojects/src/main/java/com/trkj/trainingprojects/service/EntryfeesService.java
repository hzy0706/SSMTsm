package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.Entryfees;
import com.trkj.trainingprojects.vo.EntryfeesVo;

import java.util.List;

/**
 * 报班缴费表(Entryfees)表服务接口
 *
 * @author makejava
 * @since 2021-06-18 21:53:30
 */
public interface EntryfeesService {

    Entryfees queryById(Integer feesId);

    List<Entryfees> queryAllByLimit(int offset, int limit);

    int addEntryfees(EntryfeesVo entryfeesVo);

    Entryfees update(Entryfees entryfees);

    boolean deleteById(Integer feesId);

    public List<EntryfeesVo> selectAllEntryFees();
    public int updateEntryFees(EntryfeesVo entryfeesVo);
    public int updateByEntryFeeState(EntryfeesVo entryfeesVo);
    public int deleteByEntryFees(EntryfeesVo entryfeesVo);
}
