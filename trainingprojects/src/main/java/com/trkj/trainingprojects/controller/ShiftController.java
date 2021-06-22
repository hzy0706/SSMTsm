package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.Opservice.ShiftService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.DropoutVo;
import com.trkj.trainingprojects.vo.ShiftVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
public class ShiftController {
    @Resource
    private ShiftService shiftService;

    @PostMapping("/addShift")
    public AjaxResponse addShift(@RequestBody @Valid ShiftVo shiftVo){
        shiftService.addShift(shiftVo);
        return AjaxResponse.success(shiftVo);
    }

    @GetMapping("/selectByShiftKey/{id}")
    public ShiftVo selectByShiftKey(@PathVariable("id") Integer id){
        return shiftService.selectByShiftKey(id);
    }

    @GetMapping("/selectAllShifts")
    public PageInfo<ShiftVo> selectAllShifts(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<ShiftVo> list = shiftService.selectAllShifts();
        PageInfo<ShiftVo> pageInfo = new PageInfo<>(list);
        return  pageInfo;
    }

    @PutMapping("/updateByShiftKeySelective")
    public AjaxResponse updateByShiftKeySelective(@RequestBody @Valid ShiftVo shiftVo){
        shiftService.updateByShiftKeySelective(shiftVo);
        return AjaxResponse.success(shiftVo);
    }

    @PutMapping("/deleteByShiftKey/{ids}")
    public AjaxResponse deleteByShiftKey(@PathVariable("ids") String ids){
        Date date = new Date();
        String[] id= ids.split(",");
        for (String s:id){
            ShiftVo shiftVo = new ShiftVo();
            shiftVo.setDeletetime(date);
            shiftVo.setTimeliness(1);
            shiftVo.setShiftId(Integer.parseInt(s));
            shiftService.deleteByShiftKey(shiftVo);
        }
        return AjaxResponse.success(id);
    }

    @PutMapping("/updateByTypeShiftKey2")
    public AjaxResponse updateByTypeShiftKey2(@RequestBody @Valid ShiftVo shiftVo){
        shiftVo.setJwApptime(new Date());
        shiftService.updateByTypeShiftKey2(shiftVo);
        return AjaxResponse.success(shiftVo);
    }

    @PutMapping("/updateByTypeShiftKey3")
    public AjaxResponse updateByTypeShiftKey3(@RequestBody @Valid ShiftVo shiftVo){
        shiftVo.setJwDroptimeapp(new Date());
        shiftService.updateByTypeShiftKey3(shiftVo);
        return AjaxResponse.success(shiftVo);
    }

    @PutMapping("/updateByTypeShiftKey4")
    public AjaxResponse updateByTypeShiftKey4(@RequestBody @Valid ShiftVo shiftVo){
        shiftVo.setShiftDate(new Date());
        shiftService.updateByTypeShiftKey4(shiftVo);
        return AjaxResponse.success(shiftVo);
    }

    @PutMapping("/updateByTypeShiftKey5")
    public AjaxResponse updateByTypeShiftKey5(@RequestBody @Valid ShiftVo shiftVo){
        shiftVo.setDeletetime(new Date());
        shiftService.updateByTypeShiftKey5(shiftVo);
        return AjaxResponse.success(shiftVo);
    }
}
