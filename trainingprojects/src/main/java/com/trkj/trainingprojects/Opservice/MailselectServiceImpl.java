package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.dao.MailselectDao;
import com.trkj.trainingprojects.vo.MailselectVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MailselectServiceImpl implements MailselectService {
    @Resource
    private MailselectDao mailselectDao;

    @Override
    @Transactional
    public int addMailselect(MailselectVo record) {
        return mailselectDao.addMailselect(record);
    }

    @Override
    public MailselectVo selectByMailselectKey(Integer mailselectId) {
        return mailselectDao.selectByMailselectKey(mailselectId);
    }

    @Override
    @Transactional
    public int updateByMailselectKey(MailselectVo record) {
        return mailselectDao.updateByMailselectKey(record);
    }

    @Override
    public List<MailselectVo> selectByMailselectMailId(Integer mailId) {
        return mailselectDao.selectByMailselectMailId(mailId);
    }

    @Override
    public List<MailselectVo> selectByMailselectEmpId(Integer empId) {
        return mailselectDao.selectByMailselectEmpId(empId);
    }
}
