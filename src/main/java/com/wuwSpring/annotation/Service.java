package com.wuwSpring.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * All rights Reserved, Designed By WUW
 *
 * @Title: Service
 * @Package com.wuwSpring.annotation
 * @Description:
 * @author: WUW
 * @date: 2019/9/1 13:01
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Service {
}
