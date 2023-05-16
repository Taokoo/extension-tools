package com.taokoo.extension.common.util;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @Title ：异常工具类
 * @Author：Taokoo
 * @Date 2022/11/15
 */
public class ExceptionUtil {
    private ExceptionUtil(){}

    /**
     * 获取异常信息
     */
    public static String getStackTraceInfo(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        try {
            e.printStackTrace(pw);
            pw.flush();
            sw.flush();
            return sw.toString();
        } catch (Exception ex) {
            return "异常信息转换错误";
        } finally {
            try {
                pw.close();
            } catch (Exception ex) {}
            try {
                sw.close();
            } catch (Exception ex) {}
        }
    }
}
