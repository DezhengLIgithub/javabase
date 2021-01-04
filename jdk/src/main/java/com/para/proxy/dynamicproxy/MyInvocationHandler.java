package com.para.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //通过代理对象执行方法时，会调用这个invoke方法
        Object res = null;
        //执行目标类的方法，通过method类实现
        System.out.println(method.getName() + "开始执行");
        res = method.invoke(target, args);
        System.out.println(method.getName() + "结束执行");
        //目标方法的执行结果
        return res;
    }
}
