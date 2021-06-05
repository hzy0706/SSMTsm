package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.vo.MailenclosureVo;

import java.util.List;

public interface MailenclosureService {

    int deleteByMailKey(Integer mailId);

    int addMailenclosure(MailenclosureVo record);

    MailenclosureVo selectByMailenclosureKey(Integer mailenclosureId);

    List<MailenclosureVo> selectByMailenclosureMailId(Integer mailId);
}
