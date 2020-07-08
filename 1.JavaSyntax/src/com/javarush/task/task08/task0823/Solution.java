package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Омовение Рамы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.


Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать строку с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна заменять в тексте первые буквы всех слов на заглавные.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код
        String word[] = string.split(" ");
        for(int i=0; i<word.length; i++){
            if (!(word[i].equals(""))) {
                word[i]=word[i].substring(0, 1).toUpperCase() + word[i].substring(1);
            }

        }
        String str="";
        for(int i=0; i<word.length-1; i++){
            str=str+word[i]+" ";
        }
        str=str+word[word.length-1];
        System.out.println(str);
    }
}
