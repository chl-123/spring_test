package com.chl.spring5.JunitTest;

import com.chl.spring5.TX.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//Spirng5整合Junit单元测试
@RunWith(SpringJUnit4ClassRunner.class)//单元测试框架
@ContextConfiguration("classpath:beans2.xml")//加载配置文件
public class JTest {
    @Autowired
    private UserService userService;

    @Test
    public void TransactionTest(){
        userService.accountMoney();
    }
}
