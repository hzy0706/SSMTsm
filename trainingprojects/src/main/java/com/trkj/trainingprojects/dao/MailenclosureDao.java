package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.MailenclosureVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MailenclosureDao {
    int deleteByMailKey(Integer mailenclosureId);

    int addMailenclosure(MailenclosureVo record);

    MailenclosureVo selectByMailenclosureKey(Integer mailenclosureId);

    List<MailenclosureVo> selectByMailenclosureMailId(Integer mailId);
}