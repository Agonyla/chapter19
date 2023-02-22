package com.hspedu.reader_;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Author Agony
 * @Create 2023/2/20 21:43
 * @Version 1.0
 */
public class FIleReader01 {
    public static void main(String[] args) {


    }

    /**
     * 单个字符读取文件
     */
    @Test
    public void readFile01() {
        String filePath = "D:\\Test\\story.txt";

        FileReader fileReader = null;

        int data = 0;
        try {
            fileReader = new FileReader(filePath);

            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * 字符数组读取文件
     */
    @Test
    public void readFile02() {
        String filePath = "D:\\Test\\story.txt";

        FileReader fileReader = null;

        int dataLen = 0;

        // 每次读取8个
        char[] buf = new char[8];

        try {
            fileReader = new FileReader(filePath);

            // 每次读取8个字符储存到buf中, dataLen 为 读取字符的个数，超过8个则取8个，不到8个为实际读取个数
            while ((dataLen = fileReader.read(buf)) != -1) {
                System.out.print(new String(buf, 0, dataLen));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
