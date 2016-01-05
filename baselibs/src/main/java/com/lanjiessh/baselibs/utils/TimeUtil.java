package com.lanjiessh.baselibs.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具类
 * Created by Vin on 2015/12/31.
 */
public class TimeUtil {

    public static final SimpleDateFormat DEFAULT_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final SimpleDateFormat DATE_FORMAT_DATE    = new SimpleDateFormat("yyyy-MM-dd");


    public static String getDistanceTime(String createTime) {

        SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date begin = null;
        try {
            begin = dfs.parse(createTime);
            Date nowTime = new Date();
            long between = (nowTime.getTime() - begin.getTime()) / 1000;  //除以1000是为了转换成秒

            long day = between / (24 * 3600);
            long hour = between % (24 * 3600) / 3600;
            long minute = between % 3600 / 60;
            long second = between % 60 / 60;

            String time = "";
            if(day > 0){
                time = day + "天前";
            }else if(hour > 0){
                time = hour + "小时前";
            }else if(minute > 0){
                time = minute + "分钟前";
            }else if(second > 0){
                time = second + "秒前";
            }
            return time;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }


    public static String getMonthTime(String createTime) {

        SimpleDateFormat dfs = new SimpleDateFormat("MM月dd日 HH:mm");
        Date begin = null;
        try {
            begin = dfs.parse(createTime);
            Date nowTime = new Date();
            long between = (nowTime.getTime() - begin.getTime()) / 1000;  //除以1000是为了转换成秒

            long day = between / (24 * 3600);
            long hour = between % (24 * 3600) / 3600;
            long minute = between % 3600 / 60;
            long second = between % 60 / 60;

            String time = "";
            if(day > 0){
                time = day + "天前";
            }else if(hour > 0){
                time = hour + "小时前";
            }else if(minute > 0){
                time = minute + "分钟前";
            }else if(second > 0){
                time = second + "秒前";
            }
            return time;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }



    /**
     * long time to string
     *
     * @param timeInMillis
     * @param dateFormat
     * @return
     */
    public static String getTime(long timeInMillis, SimpleDateFormat dateFormat) {
        return dateFormat.format(new Date(timeInMillis));
    }

    /**
     * long time to string, format is {@link #DEFAULT_DATE_FORMAT}
     *
     * @param timeInMillis
     * @return
     */
    public static String getDateAndTimeStr(long timeInMillis) {
        return getTime(timeInMillis, DEFAULT_DATE_FORMAT);
    }

    /**
     * long time to string, format is {@link #DEFAULT_DATE_FORMAT}
     *
     * @param timeInMillis
     * @return
     */
    public static String getDateStr(long timeInMillis) {
        return getTime(timeInMillis, DATE_FORMAT_DATE);
    }

    /**
     * get current time in milliseconds
     *
     * @return
     */
    public static long getCurrentTimeInLong() {
        return System.currentTimeMillis();
    }

    /**
     * get current time in milliseconds, format is {@link #DEFAULT_DATE_FORMAT}
     *
     * @return
     */
    public static String getCurrentTimeInString() {
        return getDateAndTimeStr(getCurrentTimeInLong());
    }

    /**
     * get current time in milliseconds
     *
     * @return
     */
    public static String getCurrentTimeInString(SimpleDateFormat dateFormat) {
        return getTime(getCurrentTimeInLong(), dateFormat);
    }

}
