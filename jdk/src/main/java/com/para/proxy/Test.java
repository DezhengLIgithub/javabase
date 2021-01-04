package com.para.proxy;

import com.para.proxy.dynamicproxy.MyInvocationHandler;
import com.para.proxy.service.SomeService;
import com.para.proxy.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        SomeService target = new SomeServiceImpl();
        InvocationHandler invocationHandler = new MyInvocationHandler(target);
        SomeService proxy = (SomeService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), invocationHandler);

        //通过代理执行方法，会调用handler中的invoke方法
        proxy.doSome();
    }
}
