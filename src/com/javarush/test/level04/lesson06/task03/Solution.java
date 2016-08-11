package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strA = reader.readLine();
        String strB = reader.readLine();
        String strC = reader.readLine();
        int a = Integer.parseInt(strA);
        int b = Integer.parseInt(strB);
        int c = Integer.parseInt(strC);
        int max = a, mid = b, min = c;

        // a - max
        if (a >= b && a>= c) {
            max = a;
            if (b >= c) {
                mid = b;
                min = c;
            } else {
                mid = c;
                min = b;
            }
        }

        // b - max
        if (b >= a && b >= c) {
            max = b;
            if (a >= c) {
                mid = a;
                min = c;
            } else {
                mid = c;
                min = a;
            }
        }

        // c - max
        if (c >= a && c >= b) {
            max = c;
            if (a >= b) {
                mid = a;
                min = b;
            } else {
                mid = b;
                min = a;
            }
        }

        System.out.println(max +" " + mid + " " + min);

    }
}
