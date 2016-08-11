package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.

4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // add 5 lines into list
        for (int i = 0; i < 5; i++) {
            String line = reader.readLine();
            list.add(line);
        }

        // remove last line & add it to beginning
        for (int i = 0; i < 13; i++) {
            int lastIndex = list.size() - 1;
            String temp = list.get(lastIndex);
            list.remove(lastIndex);
            list.add(0, temp);
        }

        // output list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
