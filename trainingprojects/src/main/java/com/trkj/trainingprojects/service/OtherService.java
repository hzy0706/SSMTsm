package com.trkj.trainingprojects.service;


import com.trkj.trainingprojects.vo.OtherVo;

import java.util.List;

/**
 * 其他开销表(Other)表服务接口
 *
 * @author makejava
 * @since 2021-06-24 14:09:08
 */
public interface OtherService {
    /**
     *查询所有
     * @return
     */
    List<OtherVo> selectOtherAll();

    /**
     * 新增
     * @param otherVo
     * @return
     */
    int addOther(OtherVo otherVo);

    /**
     * 根据id删除
     * @param otherVo
     * @return
     */
    int delOtherById(OtherVo otherVo);

}