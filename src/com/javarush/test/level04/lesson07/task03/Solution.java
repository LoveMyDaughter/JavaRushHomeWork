package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
        String strOne = bufReader.readLine();
        String strTwo = bufReader.readLine();
        String strThree = bufReader.readLine();
        int numberOne = Integer.parseInt(strOne);
        int numberTwo = Integer.parseInt(strTwo);
        int numberThree = Integer.parseInt(strThree);
        int count = 0;

        if (numberOne>0)
            count++;
        if (numberTwo>0)
            count++;
        if (numberThree>0)
            count++;

        System.out.println(count);


    }
}
