package com.javarush.task.task04.task0405;

/* 
Задаем количество котов
Напишите метод setCatsCount. Метод должен устанавливать количество котов (catsCount).

Требования:
1. Класс Cat должен содержать только одну переменную catsCount.
2. Переменная catsCount должна быть статической, иметь модификатор доступа private, тип int и проинициализирована нулем.
3. Класс Cat должен содержать два метода setCatsCount и main.
4. Метод setCatsCount класса Cat должен устанавливать значение переменной catsCount равным переданному параметру.
*/

public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        //напишите тут ваш код
        Cat.catsCount=catsCount;

    }

    public static void main(String[] args) {
        Cat cat=new Cat();
        Cat.setCatsCount(5);



    }
}