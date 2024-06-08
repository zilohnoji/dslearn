package com.donatoordep.dslearn.configuration.aop.aspects;

import com.donatoordep.dslearn.configuration.aop.PointcutDefinitions;
import com.donatoordep.dslearn.configuration.aop.annotations.UserRegisterValidate;
import com.donatoordep.dslearn.repositories.UserRepository;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserRegisterValidationAspect extends PointcutDefinitions {

    private final UserRepository USER_REPOSITORY;

    @Autowired
    public UserRegisterValidationAspect(UserRepository USER_REPOSITORY) {
        this.USER_REPOSITORY = USER_REPOSITORY;
    }

    @Before("inServiceLayer() && @annotation(validation)")
    public void userRegisterValidate(UserRegisterValidate validation, JoinPoint joinPoint){

    }
}
