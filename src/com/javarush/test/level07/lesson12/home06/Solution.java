package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).

Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать,
трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться
при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код

        // create humans
        Human grandpaFath = new Human("Vasiliy", true, 75); // grandfather of father
        Human grandpaMoth = new Human("Fedor", true, 76); // grandfather of mother
        Human grandmaFath = new Human("Sasha", false, 77); // grandmother  of father
        Human grandmaMoth = new Human("Vera", false, 84); // grandmother  of mother

        Human father = new Human("Papa", true, 55, grandpaFath, grandmaFath);   // father
        Human mother = new Human("Mama", false, 56, grandpaMoth, grandmaMoth);  // mother

        Human firstChild = new Human("Oleks", true, 33, father, mother);    // 1-child
        Human secondChild = new Human("Anton", true, 29, father, mother);   // 2-child
        Human thirdChild = new Human("Nastya", false, 19, father, mother);  // 3-child


        // output
        System.out.println(grandpaFath);
        System.out.println(grandpaMoth);
        System.out.println(grandmaFath);
        System.out.println(grandmaMoth);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(firstChild);
        System.out.println(secondChild);
        System.out.println(thirdChild);

    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father, mother;

        // 1 constructor
        public  Human(String name, boolean isMan, int age) {
            this.name = name;
            this.sex = isMan;
            this.age = age;
        }

        // 2 constructor
        public  Human(String name, boolean isMan, int age, Human father, Human mother) {
            this.name = name;
            this.sex = isMan;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
