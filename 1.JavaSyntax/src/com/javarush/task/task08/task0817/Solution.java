package com.javarush.task.task08.task0817;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String,String> map = new HashMap<>();
        map.put("Sim", "Sim2");
        map.put("Tom", "Tom2");
        map.put("Arbus", "Arbus2");
        map.put("Baby", "Baby2");
        map.put("Cat", "Cat2");
        map.put("Arbus2", "Tom2");
        map.put("Eat", "Eat2");
        map.put("Food", "Baby2");
        map.put("Gevey", "Tom2");
        map.put("Hugs", "Hugs2");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        List<String> list = new ArrayList<>(map.values());
//        System.out.println(list);
        Map<String, Long> result = list.stream().collect(Collectors.groupingBy
                (Function.identity(), Collectors.counting()));

        //перебираем там где больше двух
        for (Map.Entry<String, Long> pairResult : result.entrySet()) {
            if (pairResult.getValue() >= 2)
                removeItemFromMapByValue(map, pairResult.getKey());

        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
//        Map<String, String> map2=createMap();
//        removeTheFirstNameDuplicates(map2);
//        System.out.println(map2);

    }
}
