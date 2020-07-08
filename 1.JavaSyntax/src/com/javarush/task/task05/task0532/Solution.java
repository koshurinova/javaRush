package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.


Требования:
1. Программа должна считывать числа с клавиатуры.
2. Программа должна выводить число на экран.
3. В классе должен быть метод public static void main.
4. Нельзя добавлять новые методы в класс Solution.
5. Программа должна выводить на экран максимальное из введенных N чисел.
6. Программа не должна ничего выводить на экран, если N меньше либо равно 0.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(reader.readLine());
        if (N>0){
            int[] array=new int[N];
        for (int i=0; i<N; i++){
            array[i]=Integer.parseInt(reader.readLine());
        }
            int maximum = array[0];
            //Ищем максимальное число в массиве
            for (int k : array){
                if (k>maximum){
                    maximum=k;
                }
            }
            System.out.println(maximum);
        }                     
    }
}