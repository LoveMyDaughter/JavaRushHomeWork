package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String strD = reader.readLine();
        int a = Integer.parseInt(strA);
        int b = Integer.parseInt(strB);
        int c = Integer.parseInt(strC);
        int d = Integer.parseInt(strD);

        System.out.println(Solution.max(maxAB(a,b), maxCD(c,d)));
    }

    public static int maxAB(int a, int b) {
        if (a>b) return a;
        else return b;
    }

    public static int maxCD(int c, int d) {
        if (c>d) return c;
        else return d;
    }

    static int max(int x, int y) {
        if (x>y) return x;
        else return y;
    }
}
