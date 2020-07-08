package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить на экран максимальное из четырёх чисел.
4. Если максимальных чисел несколько, необходимо вывести любое из них.
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
        String n4=reader.readLine();
        int num1=Integer.parseInt(n1);
        int num2=Integer.parseInt(n2);
        int num3=Integer.parseInt(n3);
        int num4=Integer.parseInt(n4);

        if (num1>=num2 && num1>=num3 && num1>=num4 )
            System.out.println(num1);
        else if (num2>=num3 && num2>=num4 )
            System.out.println(num2);
        else if (num3>=num4)
            System.out.println(num3);
        else
            System.out.println(num4);
    }
}
