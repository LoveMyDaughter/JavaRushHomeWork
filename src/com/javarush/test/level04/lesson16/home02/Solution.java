package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String strNumberOne = buffer.readLine();
        String strNumberTwo = buffer.readLine();
        String strNumberThree = buffer.readLine();

        int numberOne = Integer.parseInt(strNumberOne);
        int numberTwo = Integer.parseInt(strNumberTwo);
        int numberThree = Integer.parseInt(strNumberThree);

        int middle = numberOne;

        if (numberOne >= numberTwo && numberOne >= numberThree) {
            if (numberTwo >= numberThree) {
                middle = numberTwo;
            } else
                middle = numberThree;
        }

        if (numberTwo >= numberOne && numberTwo >= numberThree) {
            if (numberOne >= numberThree) {
                middle = numberOne;
            } else
                middle = numberThree;
        }

        if (numberThree >= numberTwo && numberThree >= numberOne) {
            if (numberOne >= numberTwo) {
                middle = numberOne;
            } else
                middle = numberTwo;
        }

        System.out.println(middle);
    }
}
