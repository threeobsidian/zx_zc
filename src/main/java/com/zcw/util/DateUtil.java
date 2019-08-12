package com.zcw.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    /**
     * 返回当前的时间字符串
     * @return 时间字符串
     */
    public static String createCurrentTimeToString(String pattern){
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        return format.format(new Date());
    }
}
