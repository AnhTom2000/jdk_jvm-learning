package com.github.anhTom2000.classLoader;

/**
 * Created on 22:01  27/03/2020
 * Description:
 *
 * @author Weleness
 */

public class Test {
    static{
        System.out.println("im loaded!");
        i=0;
        i = 1;
        //System.out.println(i);
        //System.out.println(i);//Error：Cannot reference a field before it is defined（非法向前应用）
    }
    static int i=2;
    public static void main(String[] args) {

    }
}
