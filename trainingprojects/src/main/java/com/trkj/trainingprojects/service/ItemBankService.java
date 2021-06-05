package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.ItemBank;
import com.trkj.trainingprojects.vo.ItemBankVo;

import java.util.List;

/**
 * 考试题库表(ItemBank)表服务接口
 *
 * @author makejava
 * @since 2021-06-02 12:54:42
 */
public interface ItemBankService {

    ItemBank queryById(Integer itembankId);

    List<ItemBank> queryAllByLimit(int offset, int limit);

    ItemBank insert(ItemBank itembank);

    ItemBank update(ItemBank itembank);

    boolean deleteById(Integer itembankId);

    public List<ItemBankVo> selectAllItemBanks();
    public void addItemBank(ItemBankVo itemBankVo);
    public int updateByItemBankKey(ItemBankVo itemBankVo);
    public int deleteByItemBank(ItemBankVo itemBankVo);
}
