package com.lanjiessh.base.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * view inject by id
 *
 * Created by Vin on 2015/12/31.
 */

@Target(ElementType.FIELD)//表示用在字段上
@Retention(RetentionPolicy.RUNTIME)//表示在生命周期是运行时
public @interface FindView {
    int value() default 0;

}
