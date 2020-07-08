package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
"Имя" получает "число1" через "число2" лет.

Пример:
Коля получает 3000 через 5 лет.


Требования:
1. Программа должна выводить текст.
2. Программа должна считывать данные с клавиатуры.
3. Выведенный текст должен содержать введенное имя.
4. Выведенный текст должен содержать введенное число1.
5. Выведенный текст должен содержать введенное число2.
6. Выведенный тест должен полностью соответствовать заданию.
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String name = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sNumber1 = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sNumber2 = bufferedReader.readLine(); //читаем строку с клавиатуры
        System.out.println(name+" получает "+sNumber1+" через "+sNumber2+" лет.");

        //напишите тут ваш код

    }
}
