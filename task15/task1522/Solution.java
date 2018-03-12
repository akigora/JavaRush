package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        readKeyFromConsoleAndInitPlanet();
    }
        public static void readKeyFromConsoleAndInitPlanet() {
            // implement step #5 here - реализуйте задание №5 тут
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String str = reader.readLine();

                switch(str) {

                    case Planet.EARTH:
                        thePlanet = Earth.getInstance();
                        break;
                    case Planet.MOON:
                        thePlanet = Moon.getInstance();
                        break;
                    case Planet.SUN:
                        thePlanet = Sun.getInstance();
                        break;
                    default:
                        thePlanet = null;
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
