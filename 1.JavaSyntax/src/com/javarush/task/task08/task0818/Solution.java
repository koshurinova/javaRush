package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
4. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map <String, Integer> employees = new HashMap<>();
        employees.put("Sim", 505);
        employees.put("Tom", 400);
        employees.put("Arbus", 200);
        employees.put("Baby", 300);
        employees.put("Cat", 1000);
        employees.put("Arbus2", 400);
        employees.put("Eat", 1000);
        employees.put("Food", 1000);
        employees.put("Gevey", 1000);
        employees.put("Hugs", 1000);
        return employees;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> pair = (Map.Entry<String, Integer>) iterator.next();
            Integer value = pair.getValue();
            if (value<500 ){
                iterator.remove();

            }
        }
    }

    public static void main(String[] args) {
//        Map<String, Integer> map2=createMap();
//        removeItemFromMap(map2);
//        System.out.println(map2);

    }
}