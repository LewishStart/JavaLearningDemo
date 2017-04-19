package com.example.reflect.classdemo;

import com.example.reflect.util.ClassUtil;

/**
 * author: sundong
 * created at 2017/4/19 14:17
 */

public class ClassDemo3 {
    public static void main(String[] args) {
        String s = "hello";
        ClassUtil.printClassMethodMessage(s);

        Integer n1 = 1;
        ClassUtil.printClassMethodMessage(n1);
    }
}
