package com.github.lewis.core.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 服务声明式bean
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@LzComponent
public @interface LzService {
    String value() default "";
}
