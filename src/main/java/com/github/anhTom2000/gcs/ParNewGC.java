package com.github.anhTom2000.gcs;

import java.util.ArrayList;

/**
 * @Description : TODO  测试ParNew 并发收集器
 * @Author : Weleness
 * @Date : 2020/04/01
 */
public class ParNewGC {

    /**
     *
     * 设置ParNewGC回收器的参数为:
     *      * -XX:+UseConcMarkSweepGC
     *      因为CMS收集器新生代的收集器默认是ParNewGC
     */
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        boolean flag = true;
        while(flag){
            list.add(new Object());
        }
    }
}
