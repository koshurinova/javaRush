package com.javarush.task.task04.task0441;

/* 
Как-то средненько
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить среднее из трех чисел.
4. Если все числа равны, вывести любое из них.
5. Если два числа из трех равны, вывести любое из двух.
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

        if ((num1>num2 && num2>num3) || (num1<num2 && num2<num3)){
            System.out.println(num2);
        }
        else if ((num2>num3 && num3>num1) || (num2<num3 && num3<num1)){
            System.out.println(num3);
        }
        else if ((num2>num1 && num1>num3) || (num2<num1 && num1<num3)) {
            System.out.println(num1);
        }

//        else if ((num1==num2 || num2==num3 ) && num3<num1 ) {
//            System.out.println(num3);}
//
//        else if ((num1==num3 || num1==num2) && num2<num3 ) {
//            System.out.println(num2);}
//
//        else if ((num2==num3 || num1==num3) && num1<num2 ) {
//            System.out.println(num1);}
        else if (num1==num2 || num1==num3) {
          System.out.println(num1);}
        else if (num2==num3) {
            System.out.println(num2);}
        else  {
            System.out.println(num2);
        }
    }
}
