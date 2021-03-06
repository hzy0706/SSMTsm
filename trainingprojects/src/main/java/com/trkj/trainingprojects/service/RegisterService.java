package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.RegisterVo;

import java.util.List;

public interface RegisterService {
//    查询
    public List<RegisterVo> selectAllRegister();
//    增加
    public void addRegister(RegisterVo registerVo);
//    修改
    public int updateRegister(RegisterVo registerVo);
//    删除
    public int delRegister(RegisterVo registerVo);
    //    外键查询
    public List<RegisterVo> selectAllRegister2();
//    模糊查询
    public List<RegisterVo> mohuRegister(String registerName);

    public int updateShRegister(RegisterVo registerVo);

    /**
     * 修改缴费状态，并自动生成一条缴费记录
     */
    public int updateRegisterState(RegisterVo registerVo);

    /*
    * 蔡锦康 修改缴费状态
    * */
    int updateRegisterState3(RegisterVo registerVo);
}
