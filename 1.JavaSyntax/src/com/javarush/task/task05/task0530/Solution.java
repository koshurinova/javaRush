package com.javarush.task.task05.task0530;

/* 
Шеф, что-то не пашет
Задача: Программа считывает два числа с клавиатуры и выводит их сумму на экран.
Требования:
1. Программа должна считывать числа с клавиатуры.
2. В классе должен быть только один метод main.
3. Программа должна выводить строку, которая начинается на "Sum = ".
4. Программа должна выводить строку, которая заканчивается суммой введенных чисел.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();

        int sum = Integer.parseInt(a)+ Integer.parseInt(b);
        System.out.println("Sum = " + sum);
    }
}
