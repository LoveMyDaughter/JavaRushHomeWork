package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять
  объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //напишите тут ваш код
        ArrayList<int[]> collection = new ArrayList<>();

        int[] array0 = {1, 2, 3, 4, 5};
        collection.add(array0);
        int[] array1 = {1, 2};
        collection.add(array1);
        int[] array2 = {1, 2, 3, 4};
        collection.add(array2);
        int[] array3 = {1, 2, 3, 4, 5, 6, 7};
        collection.add(array3);
        int[] array4 = {};
        collection.add(array4);

        return collection;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
