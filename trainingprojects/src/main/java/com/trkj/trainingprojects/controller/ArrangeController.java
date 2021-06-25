package com.trkj.trainingprojects.controller;

import com.trkj.trainingprojects.entity.Interview;
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
import java.util.*;

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
        //保存所有需要排课的班级
        List<Integer> classIdList = new ArrayList<>();
        for (ArrangeFormVo arrangeFormVo:arrangeFormVoList) {
            classIdList.add(arrangeFormVo.getClassesId());
            System.out.println(arrangeFormVoList.size() + "========1======" + arrangeFormVo.toString());
        }
        Map<ArrangeFormVo, Integer> arrangeFormVoMap = new HashMap<>();
        Map<ArrangeFormVo, Integer> arrangeFormVoMap2 = new HashMap<>();
        /*根据教师来筛选，保证同一个老师在同一个时段只能上一个班的课*/
        List<EmpVo> empVoList = empService.selectAllEmpsByPositionId(9);
        for (int i=0;i<empVoList.size();i++){
            List<ClassesVo> classesVoList = classesService.selectAllClassesByTeacherId(empVoList.get(i).getEmpId());
            if(classesVoList.size()>1){
                for (int j=1;j<classesVoList.size();j++){
                    int classesId2 = classesVoList.get(j).getClassesId();
                    System.out.println(classesId2+"----------------------->1-----------------------");
                    for(int h=0;h<arrangeFormVoList.size();h++){
                        if(classesId2!=arrangeFormVoList.get(h).getClassesId()){
                            arrangeFormVoMap.put(arrangeFormVoList.get(h),arrangeFormVoList.get(h).getClassesId());
                        }
                    }
                }
            }else{
                for (int j=0;j<classesVoList.size();j++){
                    int classesId2 = classesVoList.get(j).getClassesId();
                    System.out.println(classesId2+"-------------------------=0---------------------");
                    for(int h=0;h<arrangeFormVoList.size();h++){
                        if(classesId2==arrangeFormVoList.get(h).getClassesId()){
                            arrangeFormVoMap2.put(arrangeFormVoList.get(h),arrangeFormVoList.get(h).getClassesId());
                        }
                    }
                }
            }

        }
        /*for (ArrangeFormVo arrangeFormVo:arrangeFormVoList){
            System.out.println(arrangeFormVoList.size()+"======2========"+arrangeFormVo.toString());
        }*/
        int c=0;
        for (Map.Entry entry : arrangeFormVoMap2.entrySet()) {
            System.out.println(c++);
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
        HashSet set = new HashSet(classIdList);
        classIdList.clear();
        classIdList.addAll(set);
        for(Integer integer:classIdList){
            System.out.println(integer+"*****************");
        }
        return AjaxResponse.success();
    }
}
