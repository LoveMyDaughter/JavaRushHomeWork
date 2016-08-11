package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String name = null;
    private String sex;
    private int age;
    public void initialize(String name){
        this.name = name;
    }

    public void initialize(String name, int age){
        this.age = age;
    }

    public void initialize(String name, int age, String sex){
        this.sex = sex;
    }
}