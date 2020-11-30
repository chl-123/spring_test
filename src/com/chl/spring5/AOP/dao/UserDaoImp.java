package com.chl.spring5.AOP.dao;

public class UserDaoImp implements UserDao{
    @Override
    public int add(int a, int b) {
        System.out.println("add 的方法执行了");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("Update 的方法执行了");
        return id;
    }
}
