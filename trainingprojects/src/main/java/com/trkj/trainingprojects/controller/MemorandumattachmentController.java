package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.Opservice.MemorandumattachmentService;
import com.trkj.trainingprojects.dao.RegisterDao;
import com.trkj.trainingprojects.dao.StudentDao;
import com.trkj.trainingprojects.dao.StudentstatusDao;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.MemorandumattachmentVo;
import com.trkj.trainingprojects.vo.RegisterVo;
import com.trkj.trainingprojects.vo.StudentVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
public class MemorandumattachmentController {
    @Resource
    private MemorandumattachmentService memorandumattachmentService;
    @Resource
    private RegisterDao registerDao;
    @Resource
    private StudentDao studentDao;
    @Resource
    private StudentstatusDao studentstatusDao;
    //查询
    @GetMapping("/selectMemorandumattachment")
    public PageInfo<MemorandumattachmentVo> selectMemorandumattachment(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        List<MemorandumattachmentVo> list=memorandumattachmentService.selectAllMemorandumattachment();
        PageInfo<MemorandumattachmentVo> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }
//    增加
    @PostMapping("/addMemorandumattachment")
    public AjaxResponse addMemorandumattachment(@RequestBody @Valid MemorandumattachmentVo memorandumattachmentVo){
        memorandumattachmentService.addMemorandumattachment(memorandumattachmentVo);
        return AjaxResponse.success(memorandumattachmentVo);
    }
    //    修改
    @PutMapping("/updateMemorandumattachment")
    public AjaxResponse updateMemorandumattachment(@RequestBody @Valid MemorandumattachmentVo memorandumattachmentVo){
//        memorandumattachmentVo.setJjexamine(1);
        memorandumattachmentService.updateMemorandumattachment(memorandumattachmentVo);
        return AjaxResponse.success(memorandumattachmentVo);
    }
//    删除
    @PutMapping("/delMemorandumattachment")
    public AjaxResponse delMemorandumattachment(@RequestBody @Valid MemorandumattachmentVo memorandumattachmentVo){
        memorandumattachmentService.delMemorandumattachment(memorandumattachmentVo);
        return AjaxResponse.success(memorandumattachmentVo);
    }

    @PutMapping("/updateJwName")
    public AjaxResponse updateJwName(@RequestBody @Valid MemorandumattachmentVo memorandumattachmentVo){
        Date date = new Date();
        memorandumattachmentVo.setJwexaminetime(date);
        memorandumattachmentVo.setJwisexamine(1);
        memorandumattachmentService.updateJwName(memorandumattachmentVo);
        return AjaxResponse.success(memorandumattachmentVo);
    }

    @PutMapping("/updateJwChName")
    public AjaxResponse updateJwChName(@RequestBody @Valid MemorandumattachmentVo memorandumattachmentVo){
        try {
            Date date = new Date();
            memorandumattachmentVo.setJwrevoketime(date);
            memorandumattachmentVo.setJwexaminetime(null);
            memorandumattachmentVo.setJwexaminename(null);
            System.out.println("学员交接：咨询登记id"+memorandumattachmentVo.getRegisterId());
            memorandumattachmentVo.setJwisexamine(0);
            RegisterVo registerVo = registerDao.queryById(memorandumattachmentVo.getRegisterId());
            System.out.println("课程编号"+registerVo.getCourseId());
            StudentVo studentVo = studentDao.queryById(memorandumattachmentVo.getRegisterId());
            //根据课程编号和学员编号删除学员交接
            int b = studentstatusDao.deleteById(registerVo.getCourseId(),studentVo.getStudentId());
            System.out.println("删除课程编号"+registerVo.getCourseId());
            System.out.println("删除学员编号"+studentVo.getStudentId());
            //根据咨询登记id删除学员
            int a = studentDao.deleteById(memorandumattachmentVo.getRegisterId());
            System.out.println("删除的学员编号"+memorandumattachmentVo.getRegisterId());
            //修改学员交接状态为未审核
            memorandumattachmentService.updateJwChName(memorandumattachmentVo);
        } catch (Exception e) {
            log.error("操作异常",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();//contoller中增加事务
        }
        return AjaxResponse.success(memorandumattachmentVo);
    }
    @PutMapping("/updateZsName")
    public AjaxResponse updateZsName(@RequestBody @Valid MemorandumattachmentVo memorandumattachmentVo){
        log.debug(memorandumattachmentVo.toString()+"con============================");
        memorandumattachmentVo.setZsexaminetime(new Date());
//        memorandumattachmentVo.setZsexaminename("name");
        memorandumattachmentService.updateZsName(memorandumattachmentVo);
        return AjaxResponse.success(memorandumattachmentVo);
    }
    //    撤销审核
    @PutMapping("updateZsChName")
    public AjaxResponse updateZsChName(@RequestParam("id") int id,@RequestParam("name") String name,@RequestBody @Valid MemorandumattachmentVo memorandumattachmentVo){
        Date data = new Date();
        memorandumattachmentVo.setZsrevoketime(data);
        memorandumattachmentVo.setZsrevokename(name);
        memorandumattachmentVo.setZsisexamine(0);
        memorandumattachmentVo.setZsexaminetime(null);
        memorandumattachmentVo.setZsexaminename(null);
        memorandumattachmentService.updateZsChName(memorandumattachmentVo);
        return AjaxResponse.success(memorandumattachmentVo);
    }
    @GetMapping("/findJjexamine")
    public AjaxResponse findJjexamine(){
        List<MemorandumattachmentVo> list= memorandumattachmentService.findJjexamine();
        log.debug(list.toString());
        return AjaxResponse.success(list);
    }
    @GetMapping("/findMemorandumattachmentKey")
    public AjaxResponse findMemorandumattachmentKey(){
        List<MemorandumattachmentVo> list= memorandumattachmentService.findMemorandumattachmentKey();
        log.debug(list.toString());
        return AjaxResponse.success(list);
    }
}
