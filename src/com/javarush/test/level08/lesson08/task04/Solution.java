package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Tsvigun", new Date("NOVEMBER 17 1986"));
        map.put("Andreyeva", new Date("AUGUST 4 1960"));
        map.put("Brother", new Date("MARCH 10 1983"));
        map.put("Annushka", new Date("JANUARY 7 1985"));
        map.put("Pysmenyuk", new Date("JUNE 15 1983"));
        map.put("Polyansky", new Date("FEBRUARY 23 1987"));
        map.put("Zhiviy", new Date("MARCH 26 1987"));
        map.put("Manko", new Date("JULY 15 1982"));
        map.put("Targonsky", new Date("NOVEMBER 25 1978"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код

        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<String, Date> pair = iter.next();
            if (pair.getValue().getMonth() == 5 || pair.getValue().getMonth() == 6 ||
                    pair.getValue().getMonth() == 7) {
                iter.remove();
            }
        }

    }

//    public static void main(String[] args) {
//        System.out.println(createMap());
//        removeAllSummerPeople(createMap());
//    }
}
