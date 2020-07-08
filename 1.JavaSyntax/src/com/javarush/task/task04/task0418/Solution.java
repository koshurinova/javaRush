package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить на экран минимальное из двух целых чисел.
4. Если два числа равны между собой, необходимо вывести любое.
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String n1=reader.readLine();
        String n2=reader.readLine();
        int num1=Integer.parseInt(n1);
        int num2=Integer.parseInt(n2);

        if (num1<=num2)
            System.out.println(num1);
        else
            System.out.println(num2);

    }
}