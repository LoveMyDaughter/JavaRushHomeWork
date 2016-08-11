package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран
полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        boolean isEntered = false;
        int sum = 0;

        while (!isEntered) {
            String strNumber = buffer.readLine();

            if ("сумма".equals(strNumber)) {
                isEntered = true;
                //break;
            } else {
                int number = Integer.parseInt(strNumber);
                sum += number;
            }
        }

        System.out.println(sum);
    }
}
