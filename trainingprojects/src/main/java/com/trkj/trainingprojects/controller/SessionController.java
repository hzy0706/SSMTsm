package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.SessionService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.SessionVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * 年届表(Session)表控制层
 *
 * @author makejava
 * @since 2021-06-02 18:52:09
 */
@RestController
@RequestMapping("session")
public class SessionController {
    /**
     * 服务对象
     */
    @Resource
    private SessionService sessionService;

    /**
     * 查询所有可用
     *
     *
     * @return
     */
    @GetMapping("selectAllSession")
    public PageInfo<SessionVo> selectall(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize) {
        System.out.println(currentPage+"-----"+pageSize);
        PageHelper.startPage(currentPage,pageSize);
        List<SessionVo> list=this.sessionService.selectAllSession();
        PageInfo<SessionVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    /**
     * 根据id查询单条
     * @return
     */
    @GetMapping("/selectById")
    public AjaxResponse selectById(@RequestParam("id")int id){
        return AjaxResponse.success(id);
    }

    /**
     * 新增
     * @param sessionVo
     * @return
     */
    @PostMapping("/addSessionALL")
    public AjaxResponse addSemesterALL(@RequestBody @Valid SessionVo sessionVo){
        sessionService.addSession(sessionVo);
        return AjaxResponse.success(sessionVo);
    }

    /**
     * 修改
     * @param sessionVo
     * @return
     */
    @PutMapping("/update")
    public  AjaxResponse updateSemesterById(@RequestBody @Valid SessionVo sessionVo){
        sessionService.update(sessionVo);
        return AjaxResponse.success(sessionVo);
    }
    /**
     * 删除
     */
    @PutMapping("/delsessionById")
    public AjaxResponse delSessionById(@RequestBody @Valid SessionVo sessionVo){
        sessionService.delSessionById(sessionVo);
        return AjaxResponse.success(sessionVo);
    }

}