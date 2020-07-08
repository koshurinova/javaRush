package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.

Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
5. Должна быть выведена только одна строка.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        int strmax=0;
        int strmin=0;
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i = 0; i<10; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            list.add(reader.readLine());
            if (list.get(i).length()>max){
                max=list.get(i).length();
//                System.out.println("max="+max);
                strmax=i;
//                System.out.println("strmax="+strmax);
            }
            if (list.get(i).length()<min){
                min=list.get(i).length();
//                System.out.println("min="+min);
                strmin=i;
//                System.out.println("strmin="+strmin);
            }
        }

        if (strmin>strmax){
            System.out.println(list.get(strmax));
        }else{
            System.out.println(list.get(strmin));
        }

    }
}
