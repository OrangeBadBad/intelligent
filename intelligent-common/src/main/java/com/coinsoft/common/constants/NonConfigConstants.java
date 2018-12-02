package com.coinsoft.common.constants;

/**
 * Created by hwh
 * 不需要配置的常量都放在这边
 */
public interface NonConfigConstants {

    /**
     * 日期格式化格式
     */
    String SDF_YMDHMS = "yyyy-MM-dd HH:mm:ss";
    String SDF_YMD = "yyyy-MM-dd";
    String DATE_START = " 00:00:00";
    String DATE_END = " 23:59:59";
    String DATE_START_HM = "00:00";
    String DATE_END_HM = "23:59";
    String DATE_MD = "M月d日";
    String DATE_NO_SS = "yyyy-MM-dd HH:mm";
    String DATE_HM = "HH:mm";
    /**


    /**
     * 真
     */
    String TRUE = "true";
    /**
     * 假
     */
    String FALSE = "false";
    /**
     * 逗号分隔符
     */
    String SEP_COMMA = ",";
    /**
     * 箭头分隔符
     */
    String SEP_ARROW = "-->";
    /**
     * 冒号分隔符
     */
    String SEP_COLON = ":";

    /**
     * 空字符串
     */
    String EMPTY_STR = "";
    /**
     * 分号
     */
    String SEP_SEMICOLON = ";";
    /**
     * 横线分割符
     */
    String SEP_BAR = "-";

    /**
     * 连接符
     */
    String SEP_AND = "&";


    /**
     * 存入缓存的key值,配置信息
     */
    String Y_CONFIG = "y_config";
    /**
     * 编码表
     */
    String Y_REAL_CODE = "y_real_code";
    /**
     * 存入缓存的key值,城市
     */
    String Y_CITY = "y_city";

    /**
     * 存入缓存key值,站点
     */
    String Y_STATION = "y_station";


    /**
     * redis 缓存失效时间,默认3天
     */
    Long EXPIRE = 3l;
    /**
     * 1天失效
     */
    Long EXPIRE1 = 1l;

    /**
     * DAY
     */
    String DAY = "day";
    /**
     * 现在
     */
    String NOW = "now";
    /**
     * 上次
     */
    String LAST = "last";
    /**
     * 下次
     */
    String NEXT = "NEXT";





}
