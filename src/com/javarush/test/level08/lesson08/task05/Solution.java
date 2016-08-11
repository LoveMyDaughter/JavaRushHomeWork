package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Tsvigun", "Anton");
        map.put("Romanukha", "Natalia");
        map.put("Morozov", "Igor");
        map.put("Riazanov", "Igor");
        map.put("Denisenko", "Alex");
        map.put("Poliansky", "Igor");
        map.put("Voronova", "Sveta");
        map.put("Zhiviy", "Yuriy");
        map.put("Savchuk", "Sveta");
        map.put("Zhitnik", "Yuriy");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код

        // create list of all first names
        ArrayList<String> listNames = new ArrayList<>();
        for (Map.Entry<String, String> pair: map.entrySet()){
            listNames.add(pair.getValue());
        }

        // list of duplicate names
        ArrayList<String> duplicateNames = new ArrayList<>();
        for (int i = 0; i < listNames.size()-1; i++) {
            String duplicate = listNames.get(i);
            for (int j = i+1; j < listNames.size(); j++) {
                if (duplicate.equals(listNames.get(j))) {
                    duplicateNames.add(listNames.get(i));
                    break;
                }
            }
        }

        // remove duplicate name from map
        for (String value : duplicateNames) {
            removeItemFromMapByValue(map, value);
        }

        System.out.println(map);
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
