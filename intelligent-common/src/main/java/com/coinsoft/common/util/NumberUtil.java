package com.coinsoft.common.util;

import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by hwh
 */
public class NumberUtil {
    private static org.slf4j.Logger logger = LoggerFactory.getLogger(NumberUtil.class);
    private static final int DEF_DIV_SCALE_2 = 2;

    /**
     * 判断字符串是否为数字
     * @param num
     * @return
     */
    public static boolean isNumberic(String num){
        return (null == num || num.length() <= 0 || num.matches("\\d{1,}")) ? true : false;
    }

    /**
     * * 两个Double数相加 *
     * @param v1 *
     * @param v2 *
     * @return Double
     */
    public static Double add(Double v1, Double v2) {
        BigDecimal b1 = new BigDecimal(v1.toString());
        BigDecimal b2 = new BigDecimal(v2.toString());
        return new Double(b1.add(b2).doubleValue());
    }

    /**
     * * 两个Double数相减 *
     *
     * @param v1 *
     * @param v2 *
     * @return Double
     */
    public static Double sub(Double v1, Double v2) {
        BigDecimal b1 = new BigDecimal(v1.toString());
        BigDecimal b2 = new BigDecimal(v2.toString());
        return new Double(b1.subtract(b2).doubleValue());
    }

    /**
     * * 两个Double数相乘 *
     *
     * @param v1 *
     * @param v2 *
     * @return Double
     */
    public static Double mul(Double v1, Double v2) {
        BigDecimal b1 = new BigDecimal(v1.toString());
        BigDecimal b2 = new BigDecimal(v2.toString());
        return new Double(b1.multiply(b2).doubleValue());
    }


    /**
     * * 两个Double数相除 *
     *
     * @param v1 *
     * @param v2 *
     * @return Double
     */
    public static Double div(Double v1, Double v2) {
        BigDecimal b1 = new BigDecimal(v1.toString());
        BigDecimal b2 = new BigDecimal(v2.toString());
        return new Double(b1
                .divide(b2, DEF_DIV_SCALE_2, BigDecimal.ROUND_HALF_UP)
                .doubleValue());
    }


    /**
     * * 两个Double数相除，并保留scale位小数 *
     *
     * @param v1 *
     * @param v2 *
     * @param scale *
     * @return Double
     */
    public static Double div(Double v1, Double v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(v1.toString());
        BigDecimal b2 = new BigDecimal(v2.toString());
        return new Double(b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP)
                .doubleValue());
    }

    /**
     * 四摄五入--设置double的精度
     * @param dbl
     * @param scale
     * @return
     */
    public static Double setScale(double dbl, int scale) {
        BigDecimal bigDecimal = new BigDecimal(dbl);
        return bigDecimal.setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * 四摄五入--设置double的精度(默认2位)
     * @param dbl
     * @return
     */
    public static Double setScale(double dbl) {
        BigDecimal bigDecimal = new BigDecimal(dbl);
        return bigDecimal.setScale(DEF_DIV_SCALE_2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }









    // test
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal(3.1415926);
        BigDecimal b2 = new BigDecimal(3.1465926);
        double f11 = b1.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        double f22 = b2.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println("f11===" + f11);  //3.14
        System.out.println("f22===" + f22);  //3.15


        DecimalFormat df = new DecimalFormat("#.00");
        String dfStr1 = df.format(3.1415926); //3.14
        String dfStr2 = df.format(3.1465926); //3.15
        System.out.println(dfStr1);
        System.out.println(dfStr2);

        double d1 = 3.1415926;
        double d2 = 3.1465926;
        System.out.println(String.format("%.2f", d1));
        System.out.println(String.format("%.2f", d2));

        //使用double很危险
        System.out.println(0.05 + 0.01);
        System.out.println(1.0 - 0.42);
        System.out.println(4.015 * 100);
        System.out.println(123.3 / 100);


        //不能够 精确的四舍五入
        System.out.println(Math.round(4.015 * 100));
        System.out.println(Math.round(4.015 * 100) / 100.0);

        //format采用的舍入模式是ROUND_HALF_DOWN（舍入模式在下面有介绍）
        System.out.println(new DecimalFormat("0.00").format(4.025));
        System.out.println(new DecimalFormat("0.00").format(4.0251));
    }
}
