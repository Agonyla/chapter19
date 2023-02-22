package com.hspedu.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author Agony
 * @Create 2023/2/22 10:59
 * @Version 1.0
 */
public class Homework01 {
    public static void main(String[] args) throws IOException {

        File file = new File("D:\\Test\\myTemp");

        if (!file.exists()) {
            if (file.mkdirs()) {
                System.out.println("创建成功");
            }
        }

        String filePath = "D:\\Test\\myTemp\\hello.txt";

        File file1 = new File(filePath);
        if (!file1.exists()) {
            if (file1.createNewFile()) {
                System.out.println("文件创建成功");

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
                bufferedWriter.write("hello,world");
                bufferedWriter.close();
            } else {
                System.out.println("文件创建失败");
            }
        } else {
            System.out.println("文件已存在");
        }

    }
}
