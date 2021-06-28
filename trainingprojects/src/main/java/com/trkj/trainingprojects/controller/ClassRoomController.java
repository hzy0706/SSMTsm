package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.ClassRoomService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.ClassRoomVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * 教室表(ClassRoom)表控制层
 *
 * @author makejava
 * @since 2021-06-02 12:43:03
 */
@RestController
@Slf4j
public class ClassRoomController {

    @Resource
    private ClassRoomService classroomService;

    @GetMapping("/selectAllClassRooms")
    public PageInfo<ClassRoomVo> selectAllClassRooms(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<ClassRoomVo> list = classroomService.selectAllClassRooms();
        PageInfo<ClassRoomVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @GetMapping("/selectAllClassRoomsByState/{state}")
    public List<ClassRoomVo> selectAllClassRoomsByState(@PathVariable("state") Integer state){
        List<ClassRoomVo> list = classroomService.selectAllClassRoomsByState(state);
        return list;
    }

    @PostMapping("/addClassRoom")
    public AjaxResponse addClassRoom(@RequestBody @Valid ClassRoomVo classRoomVo){
        Date date = new Date();
        classRoomVo.setAddtime(date);
        classroomService.addClassRoom(classRoomVo);
        return AjaxResponse.success(classRoomVo);
    }

    @PutMapping("/updateByClassRoomKey")
    public AjaxResponse updateByClassRoomKey(@RequestBody @Valid ClassRoomVo classRoomVo){
        /*System.out.println(classTypeVo+"-------------------");*/
        Date date = new Date();
        classRoomVo.setUpdatetime(date);
        classroomService.updateByClassRoomKey(classRoomVo);
        return  AjaxResponse.success(classRoomVo);
    }

    @PutMapping("/deleteByClassRoom")
    public AjaxResponse deleteByClassRoom(@RequestBody @Valid ClassRoomVo classRoomVo){
        Date date = new Date();
        classRoomVo.setDeletetime(date);
        classRoomVo.setTimeliness(1);
        classroomService.deleteByClassRoom(classRoomVo);
        return AjaxResponse.success(classRoomVo);
    }

    @PutMapping("/updateClassRoomState")
    public AjaxResponse updateClassRoomState(@RequestBody @Valid ClassRoomVo classRoomVo){
        classroomService.updateClassRoomState(classRoomVo);
        return  AjaxResponse.success(classRoomVo);
    }

}
