package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int digit1 = Integer.parseInt(reader.readLine());
        int digit2 = Integer.parseInt(reader.readLine());
        if(digit1 <= 0 || digit2 <= 0) {
            throw new Exception();
        }

        ArrayList<Integer> dig1 = new ArrayList<>();
        ArrayList<Integer> dig2 = new ArrayList<>();

        for(int i = 1; i <= digit1; i++){
            if(digit1 % i == 0){ dig1.add(i); }
        }
        for(int i = 1; i <= digit2; i++){
            if(digit2 % i == 0){ dig2.add(i); }
        }
        int max = 0;
        for(int a1 : dig1){
            for(int a2 : dig2){
                if( a1 == a2){
                    if( max < a1){
                        max = a1;
                    }
                }
            }
        }
        System.out.println(max);
        }
}
