package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> listDevThree = new ArrayList<Integer>();
        ArrayList<Integer> listDevTwo = new ArrayList<Integer>();
        ArrayList<Integer> listDiffer = new ArrayList<Integer>();

        // filling list
        for (int i = 0; i < 20; i++) {
            String strNumber = reader.readLine();
            int number = Integer.parseInt(strNumber);
            list.add(number);
        }

        // sort numbers to 3 lists
        for (Integer x : list) {
            if (x % 3 == 0) {
                listDevThree.add(x);
            }
            if (x % 2 == 0) {
                listDevTwo.add(x);
            }
            if ( (x % 3 != 0) && (x % 2 != 0) ) {
                listDiffer.add(x);
            }
        }

        // output lists
        printList(listDevThree);
        printList(listDevTwo);
        printList(listDiffer);

    }

    // method for output
    public static void printList(List<Integer> list)
    {
        //напишите тут ваш код
        for (Integer x : list) {
            System.out.println(x);
        }
    }
}
