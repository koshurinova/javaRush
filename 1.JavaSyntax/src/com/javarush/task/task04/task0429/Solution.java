package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе, в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б",
где а, б - искомые значения.

Пример:
а) при вводе чисел
2
5
6
получим вывод
количество отрицательных чисел: 0
количество положительных чисел: 3

Пример:
б) при вводе чисел
-2
-5
6
получим вывод
количество отрицательных чисел: 2
количество положительных чисел: 1


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна выводить количество отрицательных чисел в исходном наборе.
4. Программа должна выводить количество положительных чисел в исходном наборе.
5. Если отрицательных чисел нет, программа должна вывести "количество отрицательных чисел: 0".
6. Если положительных чисел нет, программа должна вывести "количество положительных чисел: 0".
7. Учесть, что число "0" не относится ни к положительным, ни к отрицательным числам.
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        String n2 = reader.readLine();
        String n3 = reader.readLine();
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        int num3 = Integer.parseInt(n3);
        int count_otr=0;
        int count_pol=0;

        if (num1>0)
            count_pol++;
        else if (num1<0)
            count_otr++;

        if (num2>0)
            count_pol++;
        else if (num2<0)
            count_otr++;

        if (num3>0)
            count_pol++;
        else if (num3<0)
            count_otr++;

        System.out.println("количество отрицательных чисел: "+count_otr);
        System.out.println("количество положительных чисел: "+count_pol);
    }

    }
