package com.javarush.task.task03.task0314;

/* 
Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4 ...
2 4 6 8 ...
3 6 9 12 ...
4 8 12 16 ...
...


Требования:
1. Программа должна выводить текст.
2. Выведенный текст должен содержать 10 строк.
3. Каждая выведенная строка должна содержать 10 чисел, разделенных пробелом.
4. Выведенные числа должны быть таблицей умножения.
*/

import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i=1; i<=10; i++){
            System.out.println(1*i+" "+2*i+" "+3*i+" "+4*i+" "+5*i+" "+6*i+" "+7*i+" "+8*i+" "+9*i+" "+10*i);
        }

    }
}
