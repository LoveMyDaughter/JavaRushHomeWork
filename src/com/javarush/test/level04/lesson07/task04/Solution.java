package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:

"количество отрицательных чисел: а", "количество положительных чисел: б"
, где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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
        int plusCount = 0, minusCount = 0;

        if (numberOne!=0) {
            if (numberOne > 0)
                plusCount++;
            else
                minusCount++;
        }

        if (numberTwo!=0) {
            if (numberTwo > 0)
                plusCount++;
            else
                minusCount++;
        }

        if (numberThree!=0) {
            if (numberThree > 0 )
                plusCount++;
            else
                minusCount++;
        }

        System.out.println("количество отрицательных чисел: " + minusCount);
        System.out.println("количество положительных чисел: " + plusCount);


    }
}
