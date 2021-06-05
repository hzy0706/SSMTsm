package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.ItemBankDao;
import com.trkj.trainingprojects.entity.ItemBank;
import com.trkj.trainingprojects.service.ItemBankService;
import com.trkj.trainingprojects.vo.ItemBankVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class ItemBankServiceImpl implements ItemBankService {
    @Resource
    private ItemBankDao itemBankDao;
    @Override
    public ItemBank queryById(Integer itembankId) {
        return null;
    }

    @Override
    public List<ItemBank> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public ItemBank insert(ItemBank itembank) {
        return null;
    }

    @Override
    public ItemBank update(ItemBank itembank) {
        return null;
    }

    @Override
    public boolean deleteById(Integer itembankId) {
        return false;
    }

    @Override
    public List<ItemBankVo> selectAllItemBanks() {
        return itemBankDao.selectAllItemBanks();
    }

    @Override
    @Transactional
    public void addItemBank(ItemBankVo itemBankVo) {
        itemBankDao.insert(itemBankVo);
    }

    @Override
    @Transactional
    public int updateByItemBankKey(ItemBankVo itemBankVo) {
        return itemBankDao.updateByItemBankKey(itemBankVo);
    }

    @Override
    @Transactional
    public int deleteByItemBank(ItemBankVo itemBankVo) {
        return itemBankDao.deleteByItemBank(itemBankVo);
    }
}
