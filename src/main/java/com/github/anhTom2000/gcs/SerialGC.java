package com.github.anhTom2000.gcs;

import java.util.ArrayList;

/**
 * @Description : TODO  测试串行收集器
 * @Author : Weleness
 * @Date : 2020/04/01
 */
public class SerialGC {
    /**
     *
     * 设置jvm参数
     *  -XX:+Xlogs:gc* 打印GC日志
     *  -XX:+UseSerialGC
     *  -XX:+PrintCommandLineFlags  打印java版本信息
     *
     *  过程：
     *  [0.479s][info][gc,phases,start] GC(4) Phase 1: Mark live objects        标记存活对象
     * [0.563s][info][gc,phases      ] GC(4) Phase 1: Mark live objects 83.764ms
     * [0.563s][info][gc,phases,start] GC(4) Phase 2: Compute new object addresses   重新计算新对象地址
     * [0.602s][info][gc,phases      ] GC(4) Phase 2: Compute new object addresses 38.584ms
     * [0.602s][info][gc,phases,start] GC(4) Phase 3: Adjust pointers   移动指针
     * [0.655s][info][gc,phases      ] GC(4) Phase 3: Adjust pointers 52.638ms
     * [0.655s][info][gc,phases,start] GC(4) Phase 4: Move objects    移动对象到新地址
     * [0.691s][info][gc,phases      ] GC(4) Phase 4: Move objects 36.079ms
     * [0.691s][info][gc             ] GC(4) Pause Full (Allocation Failure) 118M->92M(152M) 211.582ms   执行Full GC
     */
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        boolean flag = true;
        while(flag){
            list.add(new Object());
        }
    }
}
