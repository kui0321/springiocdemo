package com.wsk.service.impl;

import com.wsk.dao.UsersDao;
import com.wsk.dao.impl.UsersMybatisDaoImpl;
import com.wsk.pojo.Users;
import com.wsk.service.UsersService;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class UsersServiceImpl implements UsersService {
    private UsersDao usersDao;
    private String username;
    private int userage;
    private List<String> list;
    private List<Users> users;
    private Set<Users> selusers;
    private Map<String, String> map;
    private Map<String, Users> mapusers;
    private Properties properties;


    public void setProperties(Properties properties) {
        this.properties = properties;
    }



    public void setMapusers(Map<String, Users> mapusers) {
        this.mapusers = mapusers;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSelusers(Set<Users> selusers) {
        this.selusers = selusers;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserage(int userage) {
        this.userage = userage;
    }

    @Override
    public String toString() {
        return "UsersServiceImpl{" +
                "username='" + username + '\'' +
                ", userage=" + userage +
                '}';
    }

    public UsersServiceImpl (UsersDao usersDao){
        this.usersDao = usersDao;
    }

    public UsersDao getUsersDao() {
        return usersDao;
    }

    public void setUsersDao(UsersDao usersDao) {
        this.usersDao = usersDao;
    }



    //通过构造方法创建Bean对象
    public UsersServiceImpl(){
        System.out.println("init..............");
    }

    @Override
    public void addUsers() {
        System.out.println(this.toString());
        list.forEach(System.out::println);
        System.out.println(users);
        System.out.println(selusers);
        for(Map.Entry<String, String> entry:map.entrySet()){
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
        for(Map.Entry<String, Users> entry:mapusers.entrySet()){
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
        String value1 = this.properties.getProperty("prop1");
        String value2 = this.properties.getProperty("prop2");
        System.out.println(value1 + "\t" + value2);
        usersDao.insertUsers();
        System.out.println("UsersService addUsers....");
    }
}
