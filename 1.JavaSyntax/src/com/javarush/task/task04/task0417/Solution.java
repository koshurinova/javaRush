package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Примеры:
а) при вводе чисел
1
2
2
получим вывод
2 2

б) при вводе чисел
2
2
2
получим вывод
2 2 2

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если два числа равны между собой, необходимо вывести числа на экран.
4. Если все три числа равны между собой, необходимо вывести все три.
5. Если нет равных чисел, ничего не выводить.
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String n1=reader.readLine();
        String n2=reader.readLine();
        String n3=reader.readLine();
        int num1=Integer.parseInt(n1);
        int num2=Integer.parseInt(n2);
        int num3=Integer.parseInt(n3);

        if (num1==num3 && num1==num3 && num2==num3)
            System.out.print(num1+" "+num2+" "+num3);
        else if(num1==num2)
            System.out.print(num1+" "+num2);
        else if (num1==num3)
            System.out.print(num1+" "+num3);
        else if (num2==num3)
            System.out.print(num2+" "+num3);


    }
}