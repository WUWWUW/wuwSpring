package com.wuwSpring.helper;

import com.wuwSpring.util.ReflectionUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * All rights Reserved, Designed By WUW
 *
 * @Title: BeanHelper
 * @Package com.wuwSpring.helper
 * @Description:
 * @author: WUW
 * @date: 2019/9/1 14:20
 */
public class BeanHelper {
    /**
     * BEAN_MAP相当于一个Spring容器, 拥有应用所有bean的实例
     */
    private static final Map<Class<?>, Object> BEAN_MAP = new HashMap<Class<?>, Object>();

    static {
        //获取应用中的所有bean
        Set<Class<?>> beanClassSet = ClassHelper.getBeanClassSet();
        //将bean实例化, 并放入bean容器中
        for (Class<?> beanClass : beanClassSet) {
            Object obj = ReflectionUtil.newInstance(beanClass);
            BEAN_MAP.put(beanClass, obj);
        }
    }

    /**
     * 获取 Bean 容器
     */
    public static Map<Class<?>, Object> getBeanMap() {
        return BEAN_MAP;
    }

    /**
     * 获取 Bean 实例
     */
    @SuppressWarnings("unchecked")
    public static <T> T getBean(Class<T> cls) {
        if (!BEAN_MAP.containsKey(cls)) {
            throw new RuntimeException("can not get bean by class: " + cls);
        }
        return (T) BEAN_MAP.get(cls);
    }

    /**
     * 设置 Bean 实例
     */
    public static void setBean(Class<?> cls, Object obj) {
        BEAN_MAP.put(cls, obj);
    }

}
