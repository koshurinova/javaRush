package com.javarush.task.task04.task0439;

/* 
Письмо счастья
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: <имя> любит меня.

Пример вывода на экран для имени Света:
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.


Требования:
1. Программа должна считывать имя c клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна выводить 10 раз текст указанный в задании.
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String name =reader.readLine();

        for (int i=1; i<=10; i++){
            System.out.println(name+" любит меня.");
        }

    }
}
