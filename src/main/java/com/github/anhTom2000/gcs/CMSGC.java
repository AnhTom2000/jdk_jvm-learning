package com.github.anhTom2000.gcs;

import java.util.ArrayList;

/**
 * @Description : TODO  测试CMS 收集器
 * @Author : Weleness
 * @Date : 2020/04/01
 */
public class CMSGC {
    /**
     *
     * 使用CMS GC 收集器 JVM参数设置：
     *  -XX:+UseConcMarkSweepGC
     */
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        boolean flag =  true;
        while(flag){
            list.add(new Object());
        }

    }
}
