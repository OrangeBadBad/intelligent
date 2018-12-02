package com.coinsoft.common.util;

import com.coinsoft.common.constants.NonConfigConstants;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by hwh on
 * 补充 apache commons-lang3中 DateUtils 之外的时间处理方法
 */
public class DateUtils {

    /**
     * 指定小时 获取 时间
     *
     * @param date
     * @param hours
     * @param mins
     * @return
     */
    public static Date getTimeByDate(Date date, Integer hours, Integer mins) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        calendar.set(Calendar.HOUR_OF_DAY, hours);
        calendar.set(Calendar.MINUTE, mins);

        return calendar.getTime();
    }

    /**
     * 获取秒级时间戳
     *
     * @return
     */
    public static String getTimeStampInSeconds() {
        long time = Calendar.getInstance().getTimeInMillis();

        //精确到秒级
        String dateline = time + "";
        return dateline.substring(0, 10);
    }

    /**
     * 获取日历时间
     *
     * @return
     */
    public static Calendar calendar() {
        Calendar c = Calendar.getInstance();
        return c;
    }

    /**
     * 日期年月日
     *
     * @return
     */
    public static SimpleDateFormat sdf_ymd() {
        return new SimpleDateFormat(NonConfigConstants.SDF_YMD);
    }

    /**
     * 日期年月日时分秒
     *
     * @return
     */
    public static SimpleDateFormat sdf_ymdhms() {
        return new SimpleDateFormat(NonConfigConstants.SDF_YMDHMS);
    }

    /**
     * 日期年月日时分
     *
     * @return
     */
    public static SimpleDateFormat sdf_no_ss() {
        return new SimpleDateFormat(NonConfigConstants.DATE_NO_SS);
    }

    public static String getDateStr(Date date, String fmt) {
        return new SimpleDateFormat(fmt).format(date);
    }

    public static Date getStr2Date(String str, String fmt) {
        try {
            return new SimpleDateFormat(fmt).parse(str);
        } catch (Exception e) {
            return null;
        }
    }

}
