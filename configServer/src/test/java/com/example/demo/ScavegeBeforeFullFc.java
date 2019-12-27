package com.example.demo;

/**
 * Created by tjm on 2019/12/25.
 */
public class ScavegeBeforeFullFc {

    public static void main(String[] args) {
        //-XX:+PrintGCDetails -XX:+UseSerialGC
        System.gc();//默认情况是会用传统的模式进行fullGC  即串行的模式
        //并行的垃圾回收器会fullGC 之前都会进行一次新生代GC 目的是避免将所有的回收工作全部交给FUllGC
    }
    }

