package com.github.anhTom2000.gcs;

import java.util.ArrayList;

/**
 * @Description : TODO 测试ParallelScavenge 收集器
 * @Author : Weleness
 * @Date : 2020/04/01
 */
public class ParallelScavenge {
    /**
     * 测试 Parallel Scavenge
     *  -XX:+UseParallelGC
     */
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        while(true){
            list.add(new Object());
        }
    }
}
