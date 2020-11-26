package com.chl.spring5.service;

import com.chl.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//在注解里面value属性值可以不写，默认是类名首字母小写
//@Component
//@Controller
//@Repository
//都可以实现创建bean对象，但是推荐不同的层用对应的注解
@Service(value = "userService")//相当于<bean id="userService" class=""/>

public class UserService {
    @Value(value = "add")
     private String name;
    //定义dao类型属性，不需要添加set方法，添加注入属性注解
    @Autowired//根据类型进行注入
    @Qualifier(value = "userDaoImpl1")//根据名称进行注入
    //@Resource()
    private UserDao usrDao;


    public void add()
    {
        System.out.println("service add"+name);
        usrDao.add();
    }
}
