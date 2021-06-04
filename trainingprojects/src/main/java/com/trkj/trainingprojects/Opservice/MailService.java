package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.vo.MailVo;

import java.util.List;

public interface MailService {

    int addMail(MailVo record);

    MailVo selectByMailKey(Integer mailId);

    int deleteByMailKey(MailVo record);

    List<MailVo> selectByMailEmpId(Integer empId);
}
