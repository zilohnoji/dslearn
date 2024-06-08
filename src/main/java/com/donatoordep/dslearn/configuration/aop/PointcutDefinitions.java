package com.donatoordep.dslearn.configuration.aop;


import org.aspectj.lang.annotation.Pointcut;

public class PointcutDefinitions implements SpecificationPointcut {

    @Pointcut("within(com.donatoordep.dslearn.services.*)")
    public void inServiceLayer() {
    }

    @Pointcut("within(com.donatoordep.dslearn.entities.*)")
    public void inEntitieLayer() {
    }
}