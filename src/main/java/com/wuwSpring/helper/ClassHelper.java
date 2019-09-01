package com.wuwSpring.helper;

import com.wuwSpring.annotation.Controller;
import com.wuwSpring.annotation.Service;
import com.wuwSpring.util.ClassUtil;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;

/**
 * All rights Reserved, Designed By WUW
 *
 * @Title: ClassHelper
 * @Package com.wuwSpring.helper
 * @Description:
 * @author: WUW
 * @date: 2019/9/1 14:13
 */
public class ClassHelper {/**
 * 定义类集合（存放基础包名下的所有类）
 */
private static final Set<Class<?>> CLASS_SET;

    static {
        //获取基础包名
        String basePackage = ConfigHelper.getAppBasePackage();
        //获取基础包名下所有类
        CLASS_SET = ClassUtil.getClassSet(basePackage);
    }

    /**
     * 获取基础包名下的所有类
     */
    public static Set<Class<?>> getClassSet() {
        return CLASS_SET;
    }

    /**
     * 获取基础包名下所有 Service 类
     */
    public static Set<Class<?>> getServiceClassSet() {
        Set<Class<?>> classSet = new HashSet<Class<?>>();
        for (Class<?> cls : CLASS_SET) {
            if (cls.isAnnotationPresent(Service.class)) {
                classSet.add(cls);
            }
        }
        return classSet;
    }

    /**
     * 获取基础包名下所有 Controller 类
     */
    public static Set<Class<?>> getControllerClassSet() {
        Set<Class<?>> classSet = new HashSet<Class<?>>();
        for (Class<?> cls : CLASS_SET) {
            if (cls.isAnnotationPresent(Controller.class)) {
                classSet.add(cls);
            }
        }
        return classSet;
    }

    /**
     * 获取基础包名下所有 Bean 类（包括：Controller、Service）
     */
    public static Set<Class<?>> getBeanClassSet() {
        Set<Class<?>> beanClassSet = new HashSet<Class<?>>();
        beanClassSet.addAll(getServiceClassSet());
        beanClassSet.addAll(getControllerClassSet());
        return beanClassSet;
    }

    /**
     * 获取基础包名下某父类的所有子类 或某接口的所有实现类
     */
    public static Set<Class<?>> getClassSetBySuper(Class<?> superClass) {
        Set<Class<?>> classSet = new HashSet<Class<?>>();
        for (Class<?> cls : CLASS_SET) {
            //isAssignableFrom() 指 superClass 和 cls 是否相同或 superClass 是否是 cls 的父类/接口
            if (superClass.isAssignableFrom(cls) && !superClass.equals(cls)) {
                classSet.add(cls);
            }
        }
        return classSet;
    }

    /**
     * 获取基础包名下带有某注解的所有类
     */
    public static Set<Class<?>> getClassSetByAnnotation(Class<? extends Annotation> annotationClass) {
        Set<Class<?>> classSet = new HashSet<Class<?>>();
        for (Class<?> cls : CLASS_SET) {
            if (cls.isAnnotationPresent(annotationClass)) {
                classSet.add(cls);
            }
        }
        return classSet;
    }
}
