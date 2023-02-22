package com.hspedu.reader_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author Agony
 * @Create 2023/2/21 16:25
 * @Version 1.0
 */
public class BufferedReader01 {
    public static void main(String[] args) throws IOException {

        String filePath = "D:\\Test\\ali.js";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
