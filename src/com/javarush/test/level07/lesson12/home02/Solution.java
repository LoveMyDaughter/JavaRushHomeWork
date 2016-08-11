package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        String strN = reader.readLine();
        int n = Integer.parseInt(strN); // all lines
        String strM= reader.readLine();
        int m = Integer.parseInt(strM); // moved lines

        // list filling
        for (int i = 0; i < n; i++) {
            String line = reader.readLine();
            list.add(line);
        }
        // replace m elements
        for (int i = 0; i < m; i++) {
            list.add(list.get(0));
            list.remove(0);
        }

        // output
        for (String line : list) {
            System.out.println(line);
        }

    }
}
