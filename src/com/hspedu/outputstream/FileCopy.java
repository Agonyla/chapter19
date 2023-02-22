package com.hspedu.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author Agony
 * @Create 2023/2/20 21:16
 * @Version 1.0
 */
public class FileCopy {
    public static void main(String[] args) {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        String fileInputPath = "D:\\Test\\Agony.jpg";
        String fileOutputPath = "D:\\Test\\NewTest\\Agony.jpg";

        try {
            fileInputStream = new FileInputStream(fileInputPath);
            fileOutputStream = new FileOutputStream(fileOutputPath);


            byte[] buf = new byte[1024];
            int readLen = 0;

            while ((readLen = fileInputStream.read(buf)) != -1) {
                fileOutputStream.write(buf, 0, readLen);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
