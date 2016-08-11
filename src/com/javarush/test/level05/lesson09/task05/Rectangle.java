package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height
(левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //напишите тут ваш код

    private int top, left, width, height;
    Rectangle rectangle;

    public Rectangle(int l, int t, int w, int h) {
        left = l;
        top = t;
        width = w;
        height = h;
    }

    public Rectangle(int l, int t) {
        left = l;
        top = t;
    }

    public Rectangle(int l, int t, int w) {
        left = l;
        top = t;
        width = w;
        height = w;
    }

    public Rectangle(Rectangle recrangle){
        this.rectangle = recrangle;
    }
}
