package com.wuwSpring.util;

import org.apache.commons.lang3.ClassUtils;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;


/**
 * All rights Reserved, Designed By WUW
 *
 * @Title: PropsUtils
 * @Package com.wuwSpring.util
 * @Description:  读取配置文件工具类
 * @author: WUW
 * @date: 2019/9/1 13:06
 */
public final class PropsUtils {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(PropsUtils.class);

    /**
     * 加载属性文件
     */
    public static Properties loadProps(String fileName){
        Properties props=null;
        InputStream is=null;
        try{
            is=ClassUtil.getClassLoader().getResourceAsStream(fileName);
            if(null==is){
                throw new FileNotFoundException(fileName+" file is not found");
            }
            props=new Properties();
            props.load(is);
        }catch (Exception e){
            LOGGER.error("load properties file failed" , e);
        }finally {
            if(null!=is){
                try{
                    is.close();
                }catch (Exception e){
                    LOGGER.error("cloase input failed" , e);
                }
            }
        }
        return props;
    }

    /**
     *  获取 String 类型的属性值（默认值为空字符串）
     * @param props
     * @param key
     * @return
     */
    public static String getString(Properties props,String key){
        return getString(props,key,"");
    }

    /**
     * 获取 String 类型的属性值（可指定默认值）
     * @param props
     * @param key
     * @param defaultValue
     * @return
     */
    public static String getString(Properties props,String key,String defaultValue){
        String value=defaultValue;
        if(props.containsKey(key)){
            value=props.getProperty(key);
        }
        return value;
    }
    /**
     * 获取 int 类型的属性值（可指定默认值）
     */
    public static int getInt(Properties props, String key, int defaultValue) {
        int value = defaultValue;
        if (props.containsKey(key)) {
            value = Integer.parseInt(props.getProperty(key));
        }
        return value;
    }

    /**
     * 获取 boolean 类型属性（默认值为 false）
     */
    public static boolean getBoolean(Properties props, String key) {
        return getBoolean(props, key, false);
    }

    /**
     * 获取 boolean 类型属性（可指定默认值）
     */
    public static boolean getBoolean(Properties props, String key, boolean defaultValue) {
        boolean value = defaultValue;
        if (props.containsKey(key)) {
            value = Boolean.parseBoolean(props.getProperty(key));
        }
        return value;
    }
}

