package com.hspedu.outputstream;

import java.io.*;

/**
 * @Author Agony
 * @Create 2023/2/21 17:10
 * @Version 1.0
 */
public class BufferedCopy02 {

    public static void main(String[] args) throws IOException {

        // String scrFilePath = "D:\\Test\\NewTest\\wenzhi.jpg";
        //
        // String destFilePath = "D:\\Test\\NewTest\\wenzhi2.jpg";

        String scrFilePath = "D:\\Test\\ttt.txt";

        String destFilePath = "D:\\Test\\gcl.txt";

        
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(scrFilePath));

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFilePath));

        byte[] buf = new byte[3];
        int dataRead = 0;
        while ((dataRead = bufferedInputStream.read(buf)) != -1) {
            bufferedOutputStream.write(buf, 0, dataRead);
        }


        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
