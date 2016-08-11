package com.javarush.test.level08.lesson11.home09;


import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней
   с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
//        isDateOdd("January 1 2016");
//        isDateOdd("January 2 2016");
        isDateOdd("January 3 2016");
        isDateOdd("January 4 2016");
        isDateOdd("January 5 2016");
        //isDateOdd("JANUARY 1 2000");
        //isDateOdd("JANUARY 2 2020");

        //System.out.println(startYear);
    }



    public static boolean isDateOdd(String date){
        Date inputTime = new Date(date);
        int year = inputTime.getYear();
        Date startYear = new Date();

        startYear.setHours(0);
        startYear.setMinutes(0);
        startYear.setSeconds(0);
        startYear.setDate(1);
        startYear.setMonth(0);
        startYear.setYear(year);



        //long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках
        long msTimeDistance = (inputTime.getTime() - startYear.getTime() ) / (24 * 60 * 60 * 1000);

        //int inputDays = (int) (inputTime.getTime() / msDay);
        //System.out.println("Дней задано (от даты начала счисления) : " + inputDays);

        //int startDays = (int) (startYear.getTime() / msDay);
        //System.out.println("Дней от нач.года (+ от даты начала счисления): " + startDays);

        //int days = inputDays - startDays;
        //int days = (int) (msTimeDistance/msDay);
        //int days = (inputTime.getDay() - startYear.getDay());

        System.out.print(date + " = ");

        if (msTimeDistance % 2 == 0) {
            System.out.println("false");
            //System.out.println(msTimeDistance);
            return false;
        } else {
            System.out.println("true");
            //System.out.println(msTimeDistance);
            return true;
        }



    }
}
