package com.javarush.test.level09.lesson11.bonus02;

import java.io.*;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.

Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то
программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли, а уже потом
  считывать файл для записи.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // файл-источник не существует (не найден)
        boolean isNoSource = true;

        while (isNoSource) {    // повторяем считывание имени файла-источника, пока он не будет существовать
            try {
                String sourceFileName = reader.readLine();

                // если файл-источник не существует (не найден) - попадаем в catch-блок
                FileInputStream fileInputStream = new FileInputStream(sourceFileName);

                String destinationFileName = reader.readLine();
                FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);


                // копируем первый фалй на место второго
                while (fileInputStream.available() > 0) {
                    int data = fileInputStream.read();
                    fileOutputStream.write(data);
                }

                fileInputStream.close();
                fileOutputStream.close();

                isNoSource = false; // файл-источник найден

            // файл-источник не найден, выдаем сообщение и дальше ждем ввода имени файла
            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует.");
                isNoSource = true;
            }
        }

    }
}
