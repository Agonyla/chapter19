package com.hspedu.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author Agony
 * @Create 2023/2/21 16:40
 * @Version 1.0
 */
public class BufferedWriter01 {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\Test\\ok.txt";

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        // 追加
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));

        bufferedWriter.write("hello,gcl");
        bufferedWriter.newLine();
        bufferedWriter.write("hello,gcl1");
        bufferedWriter.newLine();
        bufferedWriter.write("hello,gcl2");
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
