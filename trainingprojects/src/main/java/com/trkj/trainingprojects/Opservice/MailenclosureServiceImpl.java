package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.dao.MailenclosureDao;
import com.trkj.trainingprojects.vo.MailenclosureVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MailenclosureServiceImpl implements MailenclosureService {
    @Resource
    private MailenclosureDao mailenclosureDao;
    @Override
    @Transactional
    public int deleteByMailKey(Integer mailId) {
        return mailenclosureDao.deleteByMailKey(mailId);
    }

    @Override
    @Transactional
    public int addMailenclosure(MailenclosureVo record) {
        return mailenclosureDao.addMailenclosure(record);
    }

    @Override
    public MailenclosureVo selectByMailenclosureKey(Integer mailenclosureId) {
        return mailenclosureDao.selectByMailenclosureKey(mailenclosureId);
    }

    @Override
    public List<MailenclosureVo> selectByMailenclosureMailId(Integer mailId) {
        return mailenclosureDao.selectByMailenclosureMailId(mailId);
    }
}
