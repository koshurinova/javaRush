package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используйте коллекции.

Требования:
1. Программа должна считывать одно значение с клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна использовать коллекции.
4. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Map<String, Integer> mounth=new HashMap<>();
        mounth.put("January", 1);
        mounth.put("February", 2);
        mounth.put("March", 3);
        mounth.put("April", 4);
        mounth.put("May", 5);
        mounth.put("June", 6);
        mounth.put("July", 7);
        mounth.put("August", 8);
        mounth.put("September", 9);
        mounth.put("October", 10);
        mounth.put("November", 11);
        mounth.put("December", 12);
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String mes=reader.readLine();
        Iterator iterator = mounth.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry pair = (Map.Entry) iterator.next();
            String key = pair.getKey().toString();
            String value = pair.getValue().toString();

            if (key.equals(mes)) {
                System.out.println(key+" is the "+value+" month");

            }
        }
    }
}
