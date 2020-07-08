package com.javarush.task.task04.task0410;

/* 
Попадём-не-попадём
Напишите метод checkInterval. Метод должен проверять попало ли целое число в интервал от 50 до 100 и сообщить результат на экран в следующем виде: "Число а не содержится в интервале." или "Число а содержится в интервале.", где а - аргумент метода.

Пример для числа 112:
Число 112 не содержится в интервале.

Пример для числа 60:
Число 60 содержится в интервале.

Требования:
•	Программа должна выводить текст на экран.
•	Метод main не должен вызывать System.out.println() или System.out.print().
•	Метод main должен вызывать метод checkInterval.
•	Метод checkInterval должен быть static void.
•	Метод checkInterval должен выводить текст на экран согласно заданию.
*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        //напишите тут ваш код
        if (a>50 && a<100)
            System.out.println("Число "+a+" содержится в интервале.");
        else
            System.out.println("Число "+a+" не содержится в интервале.");

    }
}