package com.hspedu.writer_;

import java.io.*;

/**
 * @Author Agony
 * @Create 2023/2/21 16:47
 * @Version 1.0
 */
public class BufferedCopy01 {

    public static void main(String[] args) throws IOException {

        String srcFilePath = "D:\\Test\\ali.js";
        String destFilePath = "D:\\Test\\ali2.js";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFilePath));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destFilePath));

        String line = null;

        while ((line = bufferedReader.readLine()) != null) {

            //  bufferedWriter.write(line);  读取的时候不会读取换行符
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        bufferedReader.close();
    }
}
