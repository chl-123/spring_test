package com.chl.spring5.AOP.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class UserDaoProxy implements InvocationHandler{
    private Object obj;
    public UserDaoProxy(Object obj) {
        this.obj=obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法执行之前"+method.getName()+":传递的参数"+ Arrays.toString(args));

        Object res=method.invoke(obj,args);

        System.out.println("方法执行之后"+obj);
        return res;
    }
}
