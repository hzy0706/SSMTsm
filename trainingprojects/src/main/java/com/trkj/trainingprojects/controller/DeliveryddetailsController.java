package com.trkj.trainingprojects.controller;

import com.trkj.trainingprojects.Opservice.DeliveryddetailsService;
import com.trkj.trainingprojects.vo.DeliveryddetailsVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeliveryddetailsController {
    @Resource
    private DeliveryddetailsService deliveryddetailsService;
    @GetMapping("/selectDeliveryddetailsByBookDeliveryId")
    public List<DeliveryddetailsVo> selectDeliveryddetailsByBookDeliveryId(@RequestParam("id") Integer id){
        return deliveryddetailsService.selectDeliveryddetailsByBookDeliveryId(id);
    }
}
