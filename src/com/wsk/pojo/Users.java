package com.wsk.pojo;

public class Users {
    private int usersid;
    private String username;
    private String usersex;

    public int getUsersid() {
        return usersid;
    }

    public void setUsersid(int usersid) {
        this.usersid = usersid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    @Override
    public String toString() {
        return "Users{" +
                "usersid=" + usersid +
                ", username='" + username + '\'' +
                ", usersex='" + usersex + '\'' +
                '}';
    }
}
