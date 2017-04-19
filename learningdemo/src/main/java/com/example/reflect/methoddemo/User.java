package com.example.reflect.methoddemo;

/**
 * author: sundong
 * created at 2017/4/19 14:20
 */
public class User {
    private String username;
    private String userpass;
    private int age;
    public User(){}

    public User(String username, String userpass, int age) {
        super();
        this.username = username;
        this.userpass = userpass;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUserpass() {
        return userpass;
    }
    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
