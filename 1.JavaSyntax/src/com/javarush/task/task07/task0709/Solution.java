package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.

Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 5 строк с клавиатуры и записывать их в список.
3. Программа должна выводить самую короткую строку на экран.
4. Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings= new ArrayList<String>();
        ArrayList<String> list= new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<5; i++){
            strings.add(reader.readLine());
        }
        int num=Integer.MAX_VALUE;
        for (int i=0; i<5; i++) {
            if (strings.get(i).length() < num) {
                list.clear();
                list.add(strings.get(i));
                num = strings.get(i).length();
            } else if (strings.get(i).length() == num) {
                list.add(strings.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println( list.get(i) );
        }

    }

}
