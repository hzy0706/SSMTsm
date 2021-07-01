package com.trkj.trainingprojects.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetTime {
    public String getTime(Integer deleteType){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        System.out.println(deleteType+"---------------------");
        calendar.setTime(new Date());
        calendar.add(Calendar.MONTH, -deleteType);
        Date m = calendar.getTime();
        String mon = format.format(m);
        return mon;
    }
}
