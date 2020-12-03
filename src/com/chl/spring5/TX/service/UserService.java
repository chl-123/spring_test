package com.chl.spring5.TX.service;

import com.chl.spring5.TX.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void accountMoney(){

        userDao.reduce();
        userDao.add();
    }

}
