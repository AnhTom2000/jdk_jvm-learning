package com.github.anhTom2000.classLoader;


/**
 * @Description : TODO
 * @Author : Weleness
 * @Date : 2020/03/30
 */
public class LoadClassTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {


        MyClassLoader myClassLoader = new MyClassLoader();
        MyClassLoader myClassLoader2 = new MyClassLoader();

        Class<?> aClass1 = myClassLoader.loadClass("com.github.anhTom2000.classLoader.Test");
        Class<?> aClass = myClassLoader2.loadClass("com.github.anhTom2000.classLoader.Test");

        System.out.println(aClass1.newInstance() == aClass.newInstance());
    }
}
