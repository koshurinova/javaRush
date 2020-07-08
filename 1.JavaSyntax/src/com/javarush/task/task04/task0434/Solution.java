package com.javarush.task.task04.task0434;

/* 
Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i=1;
        int k=1;
        while (k<11){
            while (i<11){
                System.out.print(i*k+" ");
                i++;
            }
            System.out.println();
            i=1;
            k++;
        }

    }
}
