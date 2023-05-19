package com.taokoo.extension.common.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @Title: 对象克隆工具类
 * @Author Taokoo
 * @Date 2021/12/1514:34
 */
public class CopyUtil {

    /**
     　* @Title: 不同对象浅克隆
     　* @author Taokoo
     　* @date 2021/12/15 14:30
     　*/
    public static void cpoyTo(Object sourceObj,Object targetObj, Class<?> clazz){
        try{
            if(sourceObj==null || targetObj==null){
                throw new Exception();
            }
            Field[] fields=clazz.getDeclaredFields();
            for(int i = 0; i < fields.length; i++){
                if(Modifier.isFinal(fields[i].getModifiers())){
                    continue;
                }
                fields[i].setAccessible(true);
                Object sourceValue=fields[i].get(sourceObj);
                fields[i].set(targetObj,sourceValue );
            }
            if(clazz.getSuperclass()==Object.class){
                return;
            }
            cpoyTo(sourceObj,targetObj,clazz.getSuperclass());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}



