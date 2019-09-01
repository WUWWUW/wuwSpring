package com.wuwSpring.annotation;

import com.wuwSpring.constants.RequestMethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * All rights Reserved, Designed By WUW
 *
 * @Title: RequestMapping
 * @Package com.wuwSpring.annotation
 * @Description:处理器注解
 * @author: WUW
 * @date: 2019/9/1 12:52
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestMapping {
    /**
     * 请求路径
     * @return
     */
    String value() default "";

    RequestMethod method() default RequestMethod.GET;
}

