package com.javarush.test.level09.lesson11.home09;

import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код

        Map<String, Cat> map = new HashMap<>();
        //Cat murka = new Cat("Murka");
        map.put("Murka", new Cat("Murka"));
        map.put("Барсик", new Cat("Барсик"));
        map.put("Белка", new Cat("Белка"));
        map.put("Рыжик", new Cat("Рыжик"));
        map.put("Киса", new Cat("Киса"));
        map.put("Диана", new Cat("Диана"));
        map.put("Пушок", new Cat("Пушок"));
        map.put("Бенни", new Cat("Бенни"));
        map.put("Ласка", new Cat("Ласка"));
        map.put("Пьеро", new Cat("Пьеро"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<>();

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            //String name = pair.getKey();
            set.add(pair.getValue());
        }

        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
