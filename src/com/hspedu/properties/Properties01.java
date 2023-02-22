package com.hspedu.properties;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author Agony
 * @Create 2023/2/22 10:27
 * @Version 1.0
 * 传统方法读取文件
 */
public class Properties01 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\mysql.properties"));

        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            String[] split = line.split("=");

            System.out.println(split[0] + " = " + split[1]);
        }

        bufferedReader.close();
    }
}
