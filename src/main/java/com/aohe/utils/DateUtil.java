package com.aohe.utils;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

public class DateUtil {

    public static final String STANDARD = "yyyy-MM-dd HH:mm:ss";

    //将字符串类型的时间转成Date类型
    public static Date string2Date(String strDate){
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(STANDARD);
        DateTime dateTime = dateTimeFormatter.parseDateTime(strDate);
        return dateTime.toDate();
    }

    public static Date string2Date(String strDate,String format){
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(format);
        DateTime dateTime = dateTimeFormatter.parseDateTime(strDate);
        return dateTime.toDate();
    }

    //将Date类型的时间转成字符串类型
    public static String date2String(Date date){
        DateTime dateTime =new DateTime(date);
        return dateTime.toString(STANDARD);
    }
    //将Date类型的时间转成字符串类型
    public static String date2String(Date date,String format){
        DateTime dateTime =new DateTime(date);
        return dateTime.toString(format);
    }
}
