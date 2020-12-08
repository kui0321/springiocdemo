package com.wsk.test;

import com.wsk.service.UsersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyInitTest {
    public static void main(String[] args) {
        //启动Spring ioc容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("opplicationContext.xml");
        System.out.println("---------------------------");
        UsersService usersService = (UsersService) applicationContext.getBean("usersService");
    }
}
