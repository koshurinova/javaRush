package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address


Требования:
1. В классе Solution создай public static класс Man.
2. В классе Solution создай public static класс Woman.
3. Класс Man должен содержать переменные: name(String), age(int) и address(String).
4. Класс Woman должен содержать переменные: name(String), age(int) и address(String).
5. У классов Man и Woman должны быть конструкторы, принимающие параметры с типами String, int и String.

*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man=new Man("Vasya", 25, "Moscow");
        Man man2=new Man("Petya", 55, "Moscow");
        Woman woman=new Woman("Masha", 20, "Moscow");
        Woman woman2=new Woman("Mashaha", 45, "NN");
        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman.name + " " + woman.age + " " + woman.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }
public static class Man {
    String name;
    int age;
    String address;
    public Man(String name, int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
}

    public static class Woman {
        String name;
        int age;
        String address;
        public Woman(String name, int age,String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
    }

    //напишите тут ваш код
}
