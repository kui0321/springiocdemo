package com.wsk.test;

import com.wsk.service.UsersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DynamicFactoryTest {
    public static void main(String[] args) {
        //启动Spring ioc容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("opplicationContext.xml");
        //从容器中获取对象信息
        UsersService usersService = (UsersService) applicationContext.getBean("usersService3");
        usersService.addUsers();
    }



}
