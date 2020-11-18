package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.

Требования:
1. Программа не должна считывать данные с клавиатуры.
2. В классе Human должно быть 6 полей.
3. Все поля класса Human должны быть private.
4. В классе Human должно быть 10 конструкторов.
5. Все конструкторы класса Human должны быть public.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private String address;
        private int salary;
        private String sex;
        private int rost;

        public Human (String name){
            this.name=name;
        }

        public Human(String name, int age, String address, int salary, String sex, int rost) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.salary = salary;
            this.sex = sex;
            this.rost = rost;
        }



        public Human(int age, String address, int salary, String sex, int rost) {
            this.age = age;
            this.address = address;
            this.salary = salary;
            this.sex = sex;
            this.rost = rost;
        }

        public Human(String address, int salary, String sex, int rost) {
            this.address = address;
            this.salary = salary;
            this.sex = sex;
            this.rost = rost;
        }

        public Human(int salary, String sex, int rost) {
            this.salary = salary;
            this.sex = sex;
            this.rost = rost;
        }

        public Human(String sex, int rost) {
            this.sex = sex;
            this.rost = rost;
        }

        public Human(int age, int salary) {
            this.age = age;
            this.salary = salary;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public Human(String name, String address, String sex) {
            this.name = name;
            this.address = address;
            this.sex = sex;
        }
    }
}
