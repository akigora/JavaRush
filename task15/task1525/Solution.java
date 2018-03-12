package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static{
        //read file
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME)));
            String str = reader.readLine();
            while (str != null){
//                System.out.println(str);
                lines.add(str);
                str = reader.readLine();
            }

            //////////
//            InputStream input = new FileInputStream(Statics.FILE_NAME);
//            while( input.available() > 0 ){
//                System.out.println(input.read());
//            }
//            input.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println(lines);

    }
}
