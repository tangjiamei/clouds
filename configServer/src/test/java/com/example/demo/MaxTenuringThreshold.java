package com.example.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tjm on 2019/12/26.
 */
public class MaxTenuringThreshold {
    public static final int _K = 1024;
    public static final int _M = 1024 * 1024;


    public static void main(String[] args) {
        System.out.println("test");
        List<Object> oo = new ArrayList<>();
        for (int i = 0; i < 5 * _K; i++) {
            Object o=new byte[_K];
            oo.add(o);
        }
        for (int i = 0; i < 10000; i++) {
            Object o=new byte[_M];
        }
    }

}
