package com.hspedu.outputstream;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author Agony
 * @Create 2023/2/20 20:43
 * @Version 1.0
 */
public class FileOutputStream01 {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile() {

        String filePath = "D:\\Test\\OutputStream.txt";

        FileOutputStream fileOutputStream = null;

        try {
            // 这个是直接覆盖
            fileOutputStream = new FileOutputStream(filePath);

            // 可以在原有内容上追加内容
            // fileOutputStream = new FileOutputStream(filePath, true);

            String str = "gcl,hello";

            fileOutputStream.write('f');
            fileOutputStream.write('\n');

            fileOutputStream.write(str.getBytes());
            fileOutputStream.write('\n');

            fileOutputStream.write(str.getBytes(), 0, 3);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
   
    }
}
