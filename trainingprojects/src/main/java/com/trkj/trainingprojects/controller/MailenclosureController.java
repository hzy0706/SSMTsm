package com.trkj.trainingprojects.controller;

import com.trkj.trainingprojects.Opservice.MailenclosureService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.MailenclosureVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
public class MailenclosureController {
    @Resource
    private MailenclosureService mailenclosureService;

    @PostMapping("/addMailenclosure")
    public AjaxResponse addMailenclosure(@RequestBody @Valid MailenclosureVo mailenclosureVo){
        mailenclosureService.addMailenclosure(mailenclosureVo);
        return AjaxResponse.success(mailenclosureVo);
    }

    @DeleteMapping("/deleteByMailKey")
    public AjaxResponse deleteByMailKey(@RequestBody @Valid MailenclosureVo mailenclosureVo){
        mailenclosureService.deleteByMailKey(mailenclosureVo.getMailId());
        return AjaxResponse.success(mailenclosureVo);
    }

    @GetMapping("/selectByMailenclosureKey/{id}")
    public MailenclosureVo selectByMailenclosureKey(@PathVariable("id") Integer id) {
        return mailenclosureService.selectByMailenclosureKey(id);
    }

    @GetMapping("/selectByMailenclosureMailId/{MailId}")
    public List<MailenclosureVo> selectByMailenclosureMailId(@PathVariable("MailId") Integer MailId) {
        return mailenclosureService.selectByMailenclosureMailId(MailId);
    }
}


















