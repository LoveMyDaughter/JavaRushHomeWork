package com.javarush.test.level04.lesson07.task02;

/* Строка - описание
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:

«четное однозначное число» - если число четное и имеет одну цифру,
«нечетное однозначное число» - если число нечетное и имеет одну цифру,

«четное двузначное число» - если число четное и имеет две цифры,
«нечетное двузначное число» - если число нечетное и имеет две цифры,

«четное трехзначное число» - если число четное и имеет три цифры,
«нечетное трехзначное число» - если число нечетное и имеет три цифры.

Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
Пример для числа 100:
четное трехзначное число
Пример для числа 51:
нечетное двузначное число
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
        String strNumber = bufReader.readLine();
        int number = Integer.parseInt(strNumber);

        if (number >=1 && number <=999) {
            if (strNumber.length()==1) {
                if (number%2==0)
                    System.out.println("четное однозначное число");
                else
                    System.out.println("нечетное однозначное число");
            }
            if (strNumber.length()==2) {
                if (number%2==0)
                    System.out.println("четное двузначное число");
                else
                    System.out.println("нечетное двузначное число");
            }
            if (strNumber.length()==3) {
                if (number%2==0)
                    System.out.println("четное трехзначное число");
                else
                    System.out.println("нечетное трехзначное число");
            }
        }

    }
}
