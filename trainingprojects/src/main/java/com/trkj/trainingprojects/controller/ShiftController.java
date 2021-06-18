package com.trkj.trainingprojects.controller;

import com.trkj.trainingprojects.Opservice.ShiftService;
import com.trkj.trainingprojects.dao.ShiftDao;
import com.trkj.trainingprojects.entity.Shift;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.DropoutVo;
import com.trkj.trainingprojects.vo.ShiftVo;
import org.springframework.transaction.annotation.Transactional;
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
}
