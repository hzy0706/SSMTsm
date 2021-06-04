package com.trkj.trainingprojects.controller;

import com.trkj.trainingprojects.entity.Semester;
import com.trkj.trainingprojects.service.SemesterService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 学期表(Semester)表控制层
 *
 * @author makejava
 * @since 2021-06-02 16:24:12
 */
@RestController
@RequestMapping("semester")
public class SemesterController {
    /**
     * 服务对象
     */
    @Resource
    private SemesterService semesterService;

    /**
     * 查询所有
     *
     * @param
     * @return 单条数据
     */

    @GetMapping("selectall")
    public AjaxResponse selectall(){
        List <Semester> list=this.semesterService.selectALL();
        return AjaxResponse.success(list);
    }
}