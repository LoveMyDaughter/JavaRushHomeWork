package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<String>();
        set.add("Лебедь");
        set.add("Лак");
        set.add("Лук");
        set.add("Лист");
        set.add("Лис");
        set.add("Лик");
        set.add("Лазурь");
        set.add("Локомотив");
        set.add("Лилия");
        set.add("Ликование");
        set.add("Ланжерон");
        set.add("Лакей");
        set.add("Лоскуток");
        set.add("Лоза");
        set.add("Лошадь");
        set.add("Лоб");
        set.add("Лаяние");
        set.add("Лакомство");
        set.add("Лор");
        set.add("Лекарство");

        return set;
    }
}
