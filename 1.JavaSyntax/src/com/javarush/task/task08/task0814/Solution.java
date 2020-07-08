package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
5. Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> setNew = new HashSet<>();
        for(int i=0; i<20; i++){
            setNew.add(i);
        }
        return setNew;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
//        Iterator<Integer> iterator = set.iterator();
//        for (int i=0; i<20; i++){
//            Integer number = iterator.next();
//            if (number>10){
//                iterator.remove();
//            }
//        }
        set.removeIf(integer -> integer > 10);
        return set;


    }

    public static void main(String[] args) {
//       System.out.println(removeAllNumbersGreaterThan10(createSet()));


    }
}
