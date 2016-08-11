package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
        int numberOne = Integer.parseInt(bufReader.readLine());
        int numberTwo = Integer.parseInt(bufReader.readLine());
        int numberThree = Integer.parseInt(bufReader.readLine());

        if (numberOne==numberTwo) {
            System.out.println("3");
        } else if (numberTwo==numberThree) {
            System.out.println("1");
        } else System.out.println("2");

    }
}
