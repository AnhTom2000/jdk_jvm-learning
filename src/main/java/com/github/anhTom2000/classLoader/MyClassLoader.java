package com.github.anhTom2000.classLoader;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/*
 * @Description : TODO
 * @Author : Weleness
 * @Date : 2020/03/30
 */
public class MyClassLoader extends ClassLoader {

    /***
     *
     * 注意: 自定义类加载器如果想打破 双亲委派机制,就要重写loadClass方法
     *      不想打破只需要重写findClass方法
     *
     */

    private String path = "/home/yangguang/下载/";
    private final String suffix = ".class";


    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException
    {
        System.out.println("load class by MyClassLoader");
        byte[] bytes = getFileBytes(className);
        return this.defineClass(className,bytes,0,bytes.length);
    }


    private byte[] getFileBytes(String filePath)
    {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try( FileChannel channel = FileChannel.open(Path.of(path+filePath.replace(".","/")+suffix), StandardOpenOption.READ);
             bos)
        {
            ByteBuffer bf  = ByteBuffer.allocate(1024);
            int length = 0;
            while ((length = channel.read(bf)) != 0)
            {
                if(length == -1)
                {
                    break;
                }
                bf.flip();
                bos.write(bf.array(),0,length);
                bf.clear();
            }
        }catch (IOException e)
        {
        }
        return bos.toByteArray();
    }
}
