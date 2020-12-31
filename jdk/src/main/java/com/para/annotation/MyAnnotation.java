package com.para.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)

public @interface MyAnnotation {
    String[] value() default "unknown";
}
