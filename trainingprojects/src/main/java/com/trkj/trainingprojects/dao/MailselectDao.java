package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.MailselectVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MailselectDao {
    int addMailselect(MailselectVo record);

    MailselectVo selectByMailselectKey(Integer mailselectId);

    int updateByMailselectKey(MailselectVo record);

    List<MailselectVo> selectByMailselectMailId(Integer mailId);

    List<MailselectVo> selectByMailselectEmpId(Integer empId);

}