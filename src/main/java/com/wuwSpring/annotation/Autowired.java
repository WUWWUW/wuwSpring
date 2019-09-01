package com.wuwSpring.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * All rights Reserved, Designed By WUW
 *
 * @Title: Autowired
 * @Package com.wuwSpring.annotation
 * @Description:依赖注入注解
 * @author: WUW
 * @date: 2019/9/1 13:00
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Autowired {
}
