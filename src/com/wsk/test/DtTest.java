package com.wsk.test;

import com.wsk.service.UsersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DtTest {
    public static void main(String[] args) {
        //启动spring ioc容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("opplicationContext.xml");
        //从ioc容器中获取
        UsersService usersService = (UsersService) applicationContext.getBean("usersService");
        usersService.addUsers();
    }
}
