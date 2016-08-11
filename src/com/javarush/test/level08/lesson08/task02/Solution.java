package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        //напишите тут ваш код

        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(6);
        set.add(90);
        set.add(43);
        set.add(22);
        set.add(8);
        set.add(7);
        set.add(29);
        set.add(0);
        set.add(-4);
        set.add(82);
        set.add(12);
        set.add(40);
        set.add(1);
        set.add(85);
        set.add(77);
        set.add(24);
        set.add(10);
        set.add(-44);
        set.add(81);

        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код

        Iterator<Integer> iterator = set.iterator();    // go through the set

        while (iterator.hasNext()) {
            Integer number = iterator.next();   // number iteration
            if( number > 10 ) {
                iterator.remove();  // remove element > 10
            }
        }

        return set;

    }
}
