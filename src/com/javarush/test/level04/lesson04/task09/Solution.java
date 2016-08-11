package com.javarush.test.level04.lesson04.task09;

/* Светофор
Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение трех минут горит зеленый сигнал,
затем в течение одной минуты — желтый, а потом в течение одной минуты — красный, затем опять зеленый горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зеленый" - если горит зеленый цвет, "желтый" - если горит желтый цвет, "красный" - если горит красный цвет.
Пример для числа 2.5:
зеленый
Пример для числа 3:
желтый
Пример для числа 4:
красный
Пример для числа 5:
зеленый
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strT = reader.readLine();
        double t = Double.parseDouble(strT);
        double partTime = t%5;
        String colour;
        // System.out.println(37.3%5);

        if ((0<=partTime) && (partTime<3)) {
            colour = "зеленый";
            System.out.println(colour);
        } else if ((3<=partTime) && (partTime<4)) {
            colour = "желтый";
            System.out.println(colour);
        } else if ((4<=partTime) && (partTime<5)) {
            colour = "красный";
            System.out.println(colour);
        }

    }
}