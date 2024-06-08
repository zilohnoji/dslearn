package com.donatoordep.dslearn.services.validations.user.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UserRegisterValidate {
    String[] values() default {"DEFAULT_VALIDATION"}; // Contain all validations for user register
}