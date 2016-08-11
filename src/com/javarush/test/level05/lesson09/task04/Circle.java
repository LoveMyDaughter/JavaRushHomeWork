package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //напишите тут ваш код

    private int centerX, centerY, radius, width;
    private String color;

    public Circle(int x, int y, int r) {
        centerX = x;
        centerY = y;
        radius = r;
    }

    public Circle(int x, int y, int r, int width) {
        centerX = x;
        centerY = y;
        radius = r;
        this.width = width;
    }

    public Circle(int x, int y, int r, int width, String color) {
        centerX = x;
        centerY = y;
        radius = r;
        this.width = width;
        this.color = color;
    }

}
