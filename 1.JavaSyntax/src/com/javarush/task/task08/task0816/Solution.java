package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/* 
Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
4. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне2", dateFormat.parse("April 1 2012"));
        map.put("Сталлоне3", dateFormat.parse("June 1 2012"));
        map.put("Сталлоне4", dateFormat.parse("July 1 2012"));
        map.put("Сталлоне5", dateFormat.parse("July 1 2012"));
        map.put("Сталлоне6", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне7", dateFormat.parse("AUGUST 1 2012"));
        map.put("Сталлоне8", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне9", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне10", dateFormat.parse("MAY 1 2012"));
        return map;

        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry pair = (Map.Entry) iterator.next();
            String value = pair.getValue().toString();
            if (value.contains("Jun") || value.contains("Jul") || value.contains("Aug") ){
                    iterator.remove();

                }
            }

//        for (Map.Entry<String, Date> pair : map.entrySet())
//        {
//            String value = pair.getValue().toString();
//            if (value.contains("Jun") || value.contains("Jul") || value.contains("Aug") ){
//                map.remove(pair.getKey());
//                System.out.println("Delete "+value);
//
//            }
//
//
//        }


    }

    public static void main(String[] args) throws ParseException {
//       Map<String, Date> map2= createMap();
//        removeAllSummerPeople(map2);
//        for (Map.Entry<String, Date> pair : map2.entrySet()) {
//            System.out.println(pair.getKey() + " - " + pair.getValue());
//        }

    }
}
