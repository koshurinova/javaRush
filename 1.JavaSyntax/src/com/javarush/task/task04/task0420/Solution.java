package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить три числа разделенных пробелами.
4. Программа должна выводить числа в порядке убывания.
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1=reader.readLine();
        String n2=reader.readLine();
        String n3=reader.readLine();
        int num1=Integer.parseInt(n1);
        int num2=Integer.parseInt(n2);
        int num3=Integer.parseInt(n3);

         if (num1>=num2 && num1>=num3) {
            System.out.print(num1 + " ");
            if (num2 >= num3) {
                System.out.print(num2 + " ");
                System.out.print(num3);
            } else {
                System.out.print(num3 + " ");
                System.out.print(num2);
            }
        }
        else if (num2>=num3){
                System.out.print(num2+" ");
                if (num1>=num3) {
                    System.out.print(num1 + " ");
                    System.out.print(num3);
                }
                else
                {
                    System.out.print(num3 + " ");
                    System.out.print(num1);
                }
            }
        else {
                System.out.print(num3 + " ");
            if (num1>=num2) {
                System.out.print(num1 + " ");
                System.out.print(num2);
            }
            else
            {
                System.out.print(num2 + " ");
                System.out.print(num1);
            }
            }

    }
}
