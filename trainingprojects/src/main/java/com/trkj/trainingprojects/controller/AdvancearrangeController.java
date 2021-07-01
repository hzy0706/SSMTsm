package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.Opservice.AdvancearrangeService;
import com.trkj.trainingprojects.service.ArrangeService;
import com.trkj.trainingprojects.service.ClassesService;
import com.trkj.trainingprojects.service.CourseDetailsService;
import com.trkj.trainingprojects.vo.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class AdvancearrangeController {
    @Resource
    private AdvancearrangeService advancearrangeService;
    @Resource
    private CourseDetailsService courseDetailsService;
    @Resource
    private ArrangeService arrangeService;
    @Resource
    private ClassesService classesService;

    /**
     * 查询所有预排课记录
     * @return
     */
    @GetMapping("/selectAllAdvancearrange")
    public List<AdvancearrangeVo> selectAllAdvancearrange(){
        List<AdvancearrangeVo> advancearrangeVoList = advancearrangeService.selectAllAdvancearrange();
        for (AdvancearrangeVo advancearrangeVo:advancearrangeVoList){
            System.out.println(advancearrangeVo.toString());
        }
        return advancearrangeVoList;
    }

    /**
     * 审核预排课记录
     * @param arrangeFormVoList
     * @return
     */
    @PutMapping("/appArrange")
    public AjaxResponse appArrange(@RequestBody @Valid List<AdvancearrangeVo> arrangeFormVoList){
        advancearrangeService.appArrange(arrangeFormVoList);
        return AjaxResponse.success(arrangeFormVoList);
    }

    @PostMapping("/checkedArrange")
    public AjaxResponse checkedArrange(@RequestBody @Valid List<ArrangeFormVo> arrangeFormVoList) throws ParseException {
        //获得选择排课的班级id
        List<ArrangeFormVo> arrangeFormVoList1 = new ArrayList<>();
        //选择排课的班级集合
        List<Integer> classIds = arrangeFormVoList.get(0).getClassesId();
        //班级对应的老师集合（一一对应）
        List<Integer> teacherIds = new ArrayList<>();
        //所选班级一周总共需要排课的次数
        int courseCount = 0;
        for (Integer integer:classIds){
            ClassesVo classesVo = classesService.queryById(integer);
            teacherIds.add(classesVo.getTeacherId());
            courseCount+=classesVo.getManylessons();
        }
        System.out.println(courseCount+"----------------所有上课总数------------------");
        System.out.println(classIds.size()+"----------------需要排课的班级数量------------------");
        for (Integer integer:teacherIds){
            System.out.println(integer+"-----------老师编号------------");
        }
        //key:教师id  value:同一个教师对应班级数组的下标
        Map<Integer,ArrayList<Integer>> saveMap=new LinkedHashMap<Integer,ArrayList<Integer>>();
        for (int i = 0; i < teacherIds.size(); i++)
        {
            if(teacherIds.get(i) != -1)//设置一个数组中不可能出现的值
            {
                //记录该数字
                int id=teacherIds.get(i);

                //创建list，用于存放数字所在的下标位置
                ArrayList<Integer> list=new ArrayList<Integer>();
                list.add(i); //记录该数字出现的第一个位置
                for (int j = i + 1; j < teacherIds.size(); j++)
                {
                    //遍历数组，查找与test[i]相同的值并记录下标
                    if(teacherIds.get(i) == teacherIds.get(j))
                    {
                        list.add(j);
                        teacherIds.set(j,-1);//同上，设置一个不可能出现的值，要与前面设置的保持一致
                    }
                }
                //通过key-value将该数字和出现的位置put进map
                saveMap.put(id, list);
            }
        }
        //key:教师id  value:同一个教师对应班级编号
        Map<String,ArrayList<Integer>> saveMap2=new LinkedHashMap<String,ArrayList<Integer>>();
        for (Map.Entry entry : saveMap.entrySet()) {
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
            System.out.println("----");
            String  str = entry.getValue().toString().substring(1, entry.getValue().toString().length()-1);
            String [] strs = str.split(",");
            ArrayList<Integer> list=new ArrayList<Integer>();
            for (String st:strs){
                list.add(classIds.get(Integer.parseInt(st.trim())));
            }
            saveMap2.put(entry.getKey().toString(), list);
        }
        System.out.println("----------------------");
        for (Map.Entry entry : saveMap2.entrySet()) {
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
            String  str = entry.getValue().toString().substring(1, entry.getValue().toString().length()-1);
            String [] strs = str.split(",");
            for (String st:strs){
                //判断该班级是否已经排够一周最大次数的排课数量
                int c=1;
                System.out.println(st+"----当前班级编号");
                ClassesVo classesVo = classesService.queryById(Integer.parseInt(st.trim()));
                //一周设置的排课次数
                int count = classesVo.getManylessons();
                System.out.println(Integer.parseInt(st.trim())+"------------一周可上课时-----------"+count);
                int step = 1;
                if(courseCount!=count){
                    step=arrangeFormVoList.size()/(courseCount-count);
                }
                System.out.println(step+"-----------排课时循环步长--------");
                for (int i = 0;i<arrangeFormVoList.size();){
                    System.out.println(i+"---------------------------------当前循环id-");
                    ArrangeFormVo arrangeFormVo = new ArrangeFormVo();
                    arrangeFormVo.setPeriodId(arrangeFormVoList.get(i).getPeriodId());
                    arrangeFormVo.setClassRoomId(arrangeFormVoList.get(i).getClassRoomId());
                    arrangeFormVo.setNewClassesId(Integer.parseInt(st.trim()));
                    String [] stri = arrangeFormVoList.get(i).getDate().split("\\(");
                    arrangeFormVo.setDate(stri[0].trim());
                    arrangeFormVo.setTercherId(Integer.parseInt(entry.getKey().toString()));
                    arrangeFormVo.setAddname(arrangeFormVoList.get(i).getAddname());
                    System.out.println("-------------添加可以排课的记录------------"+arrangeFormVo.toString());
                    arrangeFormVoList1.add(arrangeFormVo);
                    arrangeFormVoList.remove(i--);
                    if(count==c){
                        break;
                    }
                    c++;
                    System.out.println(c+"===========");
                    i+=step;
                }
                System.out.println(arrangeFormVoList.size()+"-----------------当前可排课集合数量----------------");
            }
        }
        for (Map.Entry entry : saveMap2.entrySet()) {
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
            String  str = entry.getValue().toString().substring(1, entry.getValue().toString().length()-1);
            String [] strs = str.split(",");
            //异常数据集合
            List<ArrangeFormVo> arrangeFormVoList2 = new ArrayList<>();
            for(int i=0;i<strs.length;i++){
                for (int j=0;j<arrangeFormVoList1.size();j++){
                    if(Integer.parseInt(strs[i].trim())==arrangeFormVoList1.get(j).getNewClassesId()){
                        arrangeFormVoList2.add(arrangeFormVoList1.get(j));
                    }
                }
            }
            System.out.println(arrangeFormVoList2.size()+"--------------to-----------");
            for (int h=0;h<arrangeFormVoList2.size();h++){
                int pid = arrangeFormVoList2.get(h).getPeriodId();
                String date = arrangeFormVoList2.get(h).getDate();
                System.out.println(pid+"----异常数据-----"+date);
                for (int k=h+1;k<arrangeFormVoList2.size();k++){
                    if(pid==arrangeFormVoList2.get(k).getPeriodId()
                            && date.equals(arrangeFormVoList2.get(k).getDate())){
                        //异常数据的时段id
                        int pid2 = arrangeFormVoList2.get(k).getPeriodId();
                        //异常数据的日期
                        String date2 = arrangeFormVoList2.get(k).getDate();
                        //异常数据的班级id
                        int cls2 = arrangeFormVoList2.get(k).getNewClassesId();
                        //异常数据的教室id
                        int clar2 = arrangeFormVoList2.get(k).getClassRoomId();
                        for (int f=0;f<arrangeFormVoList1.size();f++){
                            if(arrangeFormVoList1.get(f).getPeriodId()==pid2 &&
                                    arrangeFormVoList1.get(f).getClassRoomId()==clar2 &&
                                    arrangeFormVoList1.get(f).getNewClassesId()==cls2 &&
                                    arrangeFormVoList1.get(f).getDate().equals(date2)){
                                //如果排课记录里面的数据有和异常数据匹配删除
                                arrangeFormVoList1.remove(f--);

                                //加一条排课记录（时段不同）
                                for (int v=0;v<arrangeFormVoList.size();v++){
                                    if(pid2!=arrangeFormVoList.get(v).getPeriodId()){
                                        arrangeFormVoList1.add(arrangeFormVoList.get(v));
                                        arrangeFormVoList.remove(v--);
                                        break;
                                    }
                                }
                            }
                        }

                    }
                }
            }
        }
        //最终添加预排课记录
        for (ArrangeFormVo arrangeFormVo:arrangeFormVoList1){
            AdvancearrangeVo advancearrangeVo = new AdvancearrangeVo();
            advancearrangeVo.setArrangeDate(arrangeFormVo.getDate());
            advancearrangeVo.setAddname(arrangeFormVo.getAddname());
            advancearrangeVo.setClassesId(arrangeFormVo.getNewClassesId());
            advancearrangeVo.setClassroomId(arrangeFormVo.getClassRoomId());
            advancearrangeVo.setPeriodId(arrangeFormVo.getPeriodId());
            advancearrangeVo.setEmpId(arrangeFormVo.getTercherId());
            advancearrangeService.addAdvancearrange(advancearrangeVo);
        }
        return AjaxResponse.success(arrangeFormVoList1);
    }
}
