package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in) );
//        BufferedReader filereader = new BufferedReader(new InputStreamReader(new FileInputStream("d:\\hello.txt")));
        BufferedReader filereader = new BufferedReader(new InputStreamReader(new FileInputStream( reader.readLine())));
        ArrayList<Integer> list = new ArrayList<>();
        String s;
        int x;
        while( (s = filereader.readLine()) != null){
            x = Integer.parseInt(s);
            if (x%2 == 0){
                list.add(x);
            }
        }
        Collections.sort(list);

        for(int k=0; k<=list.size()-1; k++){
            System.out.println(list.get(k));
        }
        filereader.close();
        reader.close();
    }
}
