package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private String color = null;

    public void initialize(int x, int y, int r) {
        centerX = x;
        centerY = y;
        radius = r;
    }

    public void initialize(int x, int y, int r, int w) {
        centerX = x;
        centerY = y;
        radius = r;
        width = w;
    }

    public void initialize(int x, int y, int r, int w, String color) {
        centerX = x;
        centerY = y;
        radius = r;
        width = w;
        this.color = color;
    }

}
