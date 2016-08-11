package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.

3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int[] numArray = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < numArray.length; i++) {
            String strNumber = reader.readLine();
            int number = Integer.parseInt(strNumber);
            numArray[i] = number;
        }

        int j = numArray.length-1;
        for (int i = 0; i < numArray.length/2; i++) {
            int temp = numArray[i];
            numArray[i] = numArray[j];
            numArray[j] = temp;
            j--;
        }

        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }

    }
}
