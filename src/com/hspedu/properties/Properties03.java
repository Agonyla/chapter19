package com.hspedu.properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author Agony
 * @Create 2023/2/22 10:43
 * @Version 1.0
 * 用properties来创建配置文件 修改配置文件
 */
public class Properties03 {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();

        properties.setProperty("charset", "utf8");
        properties.setProperty("user", "tom");
        properties.setProperty("pwd", "abc123");
        // properties.remove("pwd");

        properties.store(new FileWriter("src\\mysql2.properties"), "hello");


    }
}
