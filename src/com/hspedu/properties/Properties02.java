package com.hspedu.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author Agony
 * @Create 2023/2/22 10:38
 * @Version 1.0
 * 使用properties类读取文件
 */
public class Properties02 {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        properties.load(new FileReader("src\\mysql.properties"));

        properties.list(System.out);

        System.out.println("===================");
        String ip = properties.getProperty("ip");
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println(ip);
        System.out.println(user);
        System.out.println(pwd);
    }
}
