package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.vo.MailselectVo;

import java.util.List;

public interface MailselectService {

    int addMailselect(MailselectVo record);

    MailselectVo selectByMailselectKey(Integer mailselectId);

    int updateByMailselectKey(MailselectVo record);

    List<MailselectVo> selectByMailselectMailId(Integer mailId);

    List<MailselectVo> selectByMailselectEmpId(Integer empId);
}
