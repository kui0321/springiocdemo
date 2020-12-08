package com.wsk.test;

import com.wsk.service.UsersService;
import com.wsk.service.impl.UsersServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsersServiceTest {
    public static void main(String[] args) {
        //UsersService usersService = new UsersServiceImpl();
        //usersService.addUsers();

        /*
        //通过IOC管理bean对象
        //启动spring ioc容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("opplicationContext.xml");
        //从ioc容器中获取
        UsersService usersService = (UsersService) applicationContext.getBean("usersService");
        usersService.addUsers();*/

        /*
        //通过id或name获取bean对象
        //启动spring ioc容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("opplicationContext.xml");
        //从容器中获取对象信息
        UsersService usersService = (UsersService) applicationContext.getBean("name2", "usersService");
        usersService.addUsers();*/

        /*
        //通过类型获取bean对象
        //启动spring ioc容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("opplicationContext.xml");
        //从容器中获取对象信息
        UsersService usersService = applicationContext.getBean(UsersServiceImpl.class);
        usersService.addUsers();*/


        /*//通过ID或name与数据类型获取bean对象
        * 方式一
        //启动spring ioc容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("opplicationContext.xml");
        UsersService usersService = applicationContext.getBean("name1", UsersService.class);
        usersService.addUsers();*/


        /*//方式二
        //获取Spring IOC容器中所有的bean对象的ID
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("opplicationContext.xml");
        String[] beanDefinitonNames = applicationContext.getBeanDefinitionNames();
        for (String name:beanDefinitonNames){
            System.out.println(name);
        }
        UsersService usersService = applicationContext.getBean(beanDefinitonNames[0],UsersServiceImpl.class);
        usersService.addUsers();*/

    }
}
