package com.chl.spring5.TX.service;

import com.chl.spring5.TX.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//利用注解进行事务管理
//@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;

    public void accountMoney(){

        userDao.reduce();
        int i = 10/0;
        userDao.add();
    }

}
