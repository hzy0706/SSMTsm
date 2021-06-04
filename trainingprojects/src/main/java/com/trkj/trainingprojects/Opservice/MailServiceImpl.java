package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.dao.MailDao;
import com.trkj.trainingprojects.vo.MailVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MailServiceImpl implements MailService {
    @Resource
    private MailDao mailDao;

    @Override
    @Transactional
    public int addMail(MailVo record) {
        return mailDao.addMail(record);
    }

    @Override
    public MailVo selectByMailKey(Integer mailId) {
        return mailDao.selectByMailKey(mailId);
    }

    @Override
    @Transactional
    public int deleteByMailKey(MailVo record) {
        return mailDao.updateByMailKey(record);
    }

    @Override
    public List<MailVo> selectByMailEmpId(Integer empId) {
        return mailDao.selectByMailEmpId(empId);
    }
}
