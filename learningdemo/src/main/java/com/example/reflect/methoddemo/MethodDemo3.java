package com.example.reflect.methoddemo;

import com.example.reflect.util.BeanUtil;

/**
 * author: sundong
 * created at 2017/4/19 14:22
 */

public class MethodDemo3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        User u1 = new User("zhangsan", "123456", 30);
        System.out.println(BeanUtil.getValueByPropertyName(u1, "username"));
        System.out.println(BeanUtil.getValueByPropertyName(u1, "userpass"));
    }

}
