package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код

        // create children
        Human childAnton = new Human("Антон", true, 29);
        Human childSasha = new Human("Саша", true, 33);
        Human childToma = new Human("Тома", true, 27);

        // create parents
        Human fatherVasiliy = new Human("папа Василий", true, 55,
                new ArrayList<>(Arrays.asList(childAnton, childSasha, childToma)) );
        Human motherLyuda = new Human("мама Люда", true, 56,
                new ArrayList<>(Arrays.asList(childAnton, childSasha, childToma)) );

        // create grandparents
        Human grandPaVasiliy = new Human("дед Вася", true, 81,
                new ArrayList<>(Arrays.asList(fatherVasiliy)) );
        Human grandMaSasha = new Human("баба Саша", true, 83,
                new ArrayList<>(Arrays.asList(fatherVasiliy)) );
        Human grandPaFedor = new Human("дед Федор", true, 80,
                new ArrayList<>(Arrays.asList(motherLyuda)) );
        Human grandMaVera = new Human("баба Вера", true, 85,
                new ArrayList<>(Arrays.asList(motherLyuda)) );

        // output
        System.out.println(grandPaVasiliy);
        System.out.println(grandPaFedor);
        System.out.println(grandMaSasha);
        System.out.println(grandMaVera);

        System.out.println(fatherVasiliy);
        System.out.println(motherLyuda);

        System.out.println(childAnton);
        System.out.println(childSasha);
        System.out.println(childToma);

    }

    public static class Human {
        //напишите тут ваш код
        private String name;
        private boolean gender;
        private int age;
        private ArrayList<Human> children = new ArrayList<>();

        // constructor with children
        public Human(String name, boolean gender, int age, ArrayList<Human> childs ) {
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.children = childs;
        }

        // constructor no children
        public Human(String name, boolean gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        @Override
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.gender ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
