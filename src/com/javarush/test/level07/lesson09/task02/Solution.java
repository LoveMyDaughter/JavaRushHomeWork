package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        // list filling
        for (int i = 0; i < 5; i++) {
            String line = reader.readLine();
            list.add(line);
        }

        // delete third element
        list.remove(2);

        // output
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

    }
}
