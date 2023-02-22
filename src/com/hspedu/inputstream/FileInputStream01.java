package com.hspedu.inputstream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author Agony
 * @Create 2023/2/20 20:17
 * @Version 1.0
 */
public class FileInputStream01 {
    public static void main(String[] args) {

    }

    @Test
    public void readFile01() {

        String filePath = "D:\\Test\\hello.txt";
        FileInputStream fileInputStream = null;

        int readData = 0;
        try {
            fileInputStream = new FileInputStream(filePath);
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            // 需要关闭文件流释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void readFile02() {

        String filePath = "D:\\Test\\hello.txt";
        FileInputStream fileInputStream = null;

        byte[] buf = new byte[3];
        // 如果把字节数组长度设置为3，就可以读入汉字了，utf8编码一个汉字 = 三个字节
        int readLen = 0;
        try {
            fileInputStream = new FileInputStream(filePath);

            // 从该输入流读取最多buf.length字节的数据到字节数组。 此方法将阻塞，直到某些输入可用。
            while ((readLen = fileInputStream.read(buf)) != -1) {
                System.out.println(new String(buf, 0, readLen));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            // 需要关闭文件流释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
