package com.javarush.task.task13.task1318;

import java.io.*;

/*
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = new FileInputStream(reader.readLine());
            while( inputStream.available() > 0 ){
                System.out.print((char) inputStream.read());
            }
        inputStream.close();
        reader.close();
    }
}
