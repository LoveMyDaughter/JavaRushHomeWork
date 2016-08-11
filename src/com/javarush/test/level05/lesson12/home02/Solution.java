package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man man1 = new Man("Anton Vasilyevich", 29, "Rivne state");
        Man man2 = new Man("Andriy Petrov", 42, "Lviv state");
        Woman woman1 = new Woman("Anna Tsvigun", 31, "Rivne");
        Woman woman2 = new Woman("Natalia Romanukha", 27, "Vinnitsa state");

        //выведи их на экран тут
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    //добавьте тут ваши классы
    public static class Man {
        String name;
        int age;
        String address;

        public Man (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
            //System.out.println(name + " " + age + " " + address);
        }

        @Override
        public String toString() {
            return "[ " + name + " " + age + " " + address + "]";
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return "[ " + name + " " + age + " " + address + "]";
        }
    }
}
