package com.trkj.trainingprojects.controller;


import com.trkj.trainingprojects.service.SystemselectService;
import com.trkj.trainingprojects.vo.SystemselectVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 制度允许查看表(Systemselect)表控制层
 *
 * @author makejava
 * @since 2021-06-30 23:14:21
 */
@RestController
public class SystemselectController {
    /**
     * 服务对象
     */
    @Resource
    private SystemselectService systemselectService;

    /**
     * 通过主键查询单条数据
     *
     * @param
     * @return 单条数据
     */
    @GetMapping("/selectSystemByEmpId")
    public List<SystemselectVo> selectByEmpId(int empId){
        System.out.println(empId+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        List<SystemselectVo> list=systemselectService.selectSystemById(empId);
        return list;
    }

}