package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.

Требования:
1. В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
2. Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
3. Программа должна выводить самую длинную строку на экран.
4. Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings= new ArrayList<String>();
        ArrayList<String> list= new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<5; i++){
                 strings.add(reader.readLine());
            }
        int num=0;
        for (int i=0; i<5; i++) {
            if (strings.get(i).length() > num) {
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
