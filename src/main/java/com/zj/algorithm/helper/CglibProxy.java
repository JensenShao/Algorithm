package com.zj.algorithm.helper;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * ${DESCRIPTION}
 *
 * @author Shao Zhen Jun
 * @created 2018-09-12-10:51
 **/
public class CglibProxy implements MethodInterceptor{
    private Object target;
    public Object getInstance(Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        long startTime = System.currentTimeMillis();
        methodProxy.invokeSuper(o, objects);
        long endTime = System.currentTimeMillis();
        System.out.println(o.getClass().getSimpleName()+" running time is :"+((endTime-startTime)));
        return null;
    }
}
