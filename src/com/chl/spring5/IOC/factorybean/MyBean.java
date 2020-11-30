package com.chl.spring5.IOC.factorybean;

import com.chl.spring5.IOC.Course;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Course> {//实现工厂bean的方法，可以使定义类型和返回类型可以不一样
    @Override
    public Course getObject() throws Exception {
        Course course=new Course();
        course.setCname("ghg");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
