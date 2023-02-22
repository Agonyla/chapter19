package com.hspedu.homework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author Agony
 * @Create 2023/2/22 11:15
 * @Version 1.0
 */
public class Homework02 {
    public static void main(String[] args) throws IOException {

        String filePath = "D:\\Test\\Homework02.txt";

        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "gbk"));
        // BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        String line = null;
        int i = 0;
        while ((line = bufferedReader1.readLine()) != null) {

            System.out.print(++i + " ");
            System.out.println(line);
        }
        bufferedReader1.close();
    }
}
