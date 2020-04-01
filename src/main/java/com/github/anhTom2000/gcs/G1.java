package com.github.anhTom2000.gcs;

import java.util.ArrayList;

/**
 * @Description : TODO 测试G1收集器
 * @Author : Weleness
 * @Date : 2020/04/01
 */
public class G1 {
    /**
     *
     *  我的jdk版本是12，所以默认是G1，不用设置jvm参数
     */

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>(6);
        boolean flag = true;
        while(flag){
            list.add(new Object());
            if(list.size() == 5) list.clear();
        }
    }
}
