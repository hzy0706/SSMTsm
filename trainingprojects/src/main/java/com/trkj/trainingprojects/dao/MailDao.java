package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.MailVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MailDao {

    int addMail(MailVo record);

    MailVo selectByMailKey(Integer mailId);

    int updateByMailKey(MailVo record);

    List<MailVo> selectByMailEmpId(Integer empId);
}