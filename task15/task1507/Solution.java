package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(String value, int m, int n) {}
    public static void printMatrix(int n, String value, int m) {}
    public static void printMatrix(double n, int m, String value) {}
    public static void printMatrix(int n, double m, String value) {}
    public static void printMatrix(double n, int m, Object value) {}
    public static void printMatrix(int n, double m, Object value) {}
    public static void printMatrix(Object n, Object m, String value) {}
    public static void printMatrix(Object n, Object m, Object value) {}
}
