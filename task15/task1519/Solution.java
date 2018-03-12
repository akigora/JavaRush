package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String str = buffer.readLine();
        while( !str.equals("exit")){
            try {
                int myint = Integer.parseInt(str);
                if( myint>0 && myint<128) { Short myshort = Short.parseShort(str); print(myshort); }
                if( myint <=0 || myint>=128 ) { print(myint); }
            } catch (NumberFormatException e) {
                try { double mydoub = Double.parseDouble(str); print(mydoub); } catch(NumberFormatException e1) { print(str); }
            }
            str = buffer.readLine();
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
