package com.trkj.trainingprojects.controller;

import com.trkj.trainingprojects.service.ArrangeService;
import com.trkj.trainingprojects.service.ClassesService;
import com.trkj.trainingprojects.service.EmpService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.ArrangeFormVo;
import com.trkj.trainingprojects.vo.ClassesVo;
import com.trkj.trainingprojects.vo.EmpVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ArrangeController {
    @Resource
    private ArrangeService arrangeService;
    @Resource
    private ClassesService classesService;
    @Resource
    private EmpService empService;
    @PostMapping("checkedArrange")
    public AjaxResponse checkedArrange(@RequestBody @Valid List<ArrangeFormVo> arrangeFormVoList){
        List<ArrangeFormVo> list1 = new ArrayList<>();
        for (ArrangeFormVo arrangeFormVo:arrangeFormVoList) {
            System.out.println(arrangeFormVoList.size() + "========1======" + arrangeFormVo.toString());
        }
        /*根据教师来筛选，保证同一个老师在同一个时段只能上一个班的课*/
        List<EmpVo> empVoList = empService.selectAllEmpsByPositionId(9);
        for (int i=0;i<empVoList.size();i++){
            List<ClassesVo> classesVoList = classesService.selectAllClassesByTeacherId(empVoList.get(i).getEmpId());
            System.out.println(classesVoList.size()+"------------------------------------------");
            for (int j=1;j<classesVoList.size();j++){
                int classesId2 = classesVoList.get(j).getClassesId();
                System.out.println(classesId2+"----------------------------classesId2-------------------------------");
                for(int h=0;h<arrangeFormVoList.size();h++){
                    if(classesId2==arrangeFormVoList.get(h).getClassesId()){
                        System.out.println(arrangeFormVoList.get(h).toString()+"------------------");
                        arrangeFormVoList.remove(h--);
                    }
                }
            }
        }
        for (ArrangeFormVo arrangeFormVo:arrangeFormVoList){
            System.out.println(arrangeFormVoList.size()+"======2========"+arrangeFormVo.toString());
        }
        return AjaxResponse.success();
    }
}
