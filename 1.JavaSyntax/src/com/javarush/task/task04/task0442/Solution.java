package com.javarush.task.task04.task0442;

/* 
Суммирование
Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.

Подсказка: один из вариантов решения этой задачи, использовать конструкцию:



Требования:
1. Программа должна считывать числа c клавиатуры.
2. Если пользователь ввел -1, программа должна вывести сумму всех введенных чисел на экран и завершиться.
3. Программа должна посчитать сумму введенных чисел и вывести её на экран.
4. В программе должен использоваться цикл for, while или do-while.
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int sum=0;
        while (true) {
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            String num=reader.readLine();
            int n=Integer.parseInt(num);
            if (n==-1){
                sum=sum+n;
                System.out.println(sum);
                break;
            }
            sum=sum+n;

        }
    }
}
