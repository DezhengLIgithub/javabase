package com.para.Util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    private DateUtil(){}



    public static String getFormatDate(long timeStamp){
        return getFormatDate(timeStamp, "");
    }

    public static String getFormatDate(long timeStamp, String format) {
        if(format == null || format.trim().equals("")) {
            format="yyyy-MM-dd HH:mm:ss";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date = new Date(timeStamp);
        return sdf.format(date);
    }


    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
    }
}
