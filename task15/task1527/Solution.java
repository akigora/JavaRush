package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
//        String str = "http://javarush.ru/alpha/index.html?lvl=15&view&obj=Amigo";
        int par = str.indexOf("?") + 1;
        String result = "";
        int equal = str.indexOf("=", par + 1);
        int and = str.indexOf("&", par + 1);

        ArrayList<String> list = new ArrayList();

        while(par<str.length()) {
            if(equal == and){ break; }
            if(equal == -1){ equal = 9999999;}
            if(and == -1){ and = 9999999; }

            if (equal < and) {
                String temp = str.substring(par, equal);
                result = result + temp + " ";
                ///// object verification
                if(temp.equals("obj") ){
                    if( and == 9999999){
                        list.add(str.substring(equal + 1, str.length()));
                    } else {
                        list.add(str.substring(equal + 1, str.indexOf("&", equal)));
                    }
                }
                ////
                par = and + 1;  // starting with &
            } else {
                String temp = str.substring(par, and);
                result = result + temp + " ";
                ///// object verification
                if(temp.equals("obj")){
                    list.add(str.substring(equal + 1, str.indexOf("&", equal)));
                }
                ////
                par = and + 1; // starting with &
            }
            equal = str.indexOf("=", par);
            and = str.indexOf("&", par);
        }
        System.out.println(result);
        for(int i=0; i<=list.size()-1; i++){
            try{
                alert(Double.parseDouble(list.get(i)));
            } catch (NumberFormatException e){
                alert(list.get(i));
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
