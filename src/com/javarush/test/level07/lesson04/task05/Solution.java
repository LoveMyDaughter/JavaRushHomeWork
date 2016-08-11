package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину
во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int[] bigArray = new int[20];
        int[] firstArray = new int[10];
        int[] secondArray = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < bigArray.length; i ++) {
            String strNumber = reader.readLine();
            int number = Integer.parseInt(strNumber);
            bigArray[i] = number;
        }

        for (int i = 0; i < bigArray.length/2; i ++) {
            firstArray[i] = bigArray[i];
        }

        int j = 0;
        for (int i = bigArray.length/2; i < bigArray.length; i ++) {
            secondArray[j] = bigArray[i];
            System.out.println(secondArray[j]);
            j++;
        }

    }
}
