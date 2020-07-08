package com.javarush.task.task08.task0815;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String,String> map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Arbus2", "Tom");
        map.put("Eat", "Eat");
        map.put("Food", "Baby");
        map.put("Gevey", "Tom");
        map.put("Hugs", "Hugs");
        return map;


    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int num=0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String value = pair.getValue();
            if (value==name){
                num++;
            }

        }
        return num;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int num=0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();
            if (key==lastName){
                num++;
            }

        }
        return num;


    }

    public static void main(String[] args) {
//        System.out.println(getCountTheSameFirstName(createMap(), "Tom"));
//        System.out.println(getCountTheSameLastName(createMap(), "Tom"));

    }
}
