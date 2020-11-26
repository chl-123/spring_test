package com.chl.spring5;

import com.chl.spring5.autowire.Emp;
import com.chl.spring5.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
@org.junit.Test
    public void testAdd()
    {
        //1.加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        User user=context.getBean("User",User.class);
        System.out.println(user);
        user.add();


    }
    @org.junit.Test
    public void bookprint()
    {
        //1.加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Book book=context.getBean("book",Book.class);

        book.print();


    }
    @org.junit.Test
    public void orderTest(){

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Orders orders=context.getBean("orders",Orders.class);
        orders.print();
    }
                
    public void StudentTest(){

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Students students=context.getBean("Student" ,Students.class);
        students.print();
    }
    //工厂bean的测试方法
    @org.junit.Test
    public void FactoryBeanTest(){

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Course course=context.getBean("mybean" ,Course.class);
        System.out.println(course.toString());
    }
    //多实例测试方法
    @org.junit.Test
    public void multi_caseTest(){

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Book book1=context.getBean("book3",Book.class);
        Book book2=context.getBean("book3",Book.class);
        System.out.println(book1);
        System.out.println(book2);
    }
    //多实例测试方法
    @org.junit.Test
    public void autowireTest(){

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Emp emp=context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
    //注解测试
    @org.junit.Test
    public void annotationTest1(){

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        UserService userService=context.getBean("userService", UserService.class);
        userService.add();
    }
    //注解测试
    @org.junit.Test
    public void annotationTest2(){

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        UserService userService=context.getBean("userService", UserService.class);
        userService.add();
    }
}
