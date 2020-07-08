package com.javarush.task.task05.task0517;

/* 
Конструируем котиков

Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)

Задача конструктора - сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.


Требования:
1. У класса Cat должна быть переменная name с типом String.
2. У класса Cat должна быть переменная age с типом int.
3. У класса Cat должна быть переменная weight с типом int.
4. У класса Cat должна быть переменная address с типом String.
5. У класса Cat должна быть переменная color с типом String.
6. У класса должен быть конструктор, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age = 4;
    int weight=7;
    String address;
    String color = "black";


    public static void main(String[] args) {

    }
// - Имя
    public Cat(String name) {
        this.name=name;
    }
//- Имя, вес, возраст
    public Cat(String name,  int weight, int age) {
        this.name=name;
        this.age=age;
        this.weight=weight;

    }
// - Имя, возраст (вес стандартный)
    public Cat(String name, int age) {
        this.name=name;
        this.age=age;
    }
//- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
    public Cat(int weight, String color) {
    this.color=color;
    this.weight=weight;
}
//- вес, цвет, адрес (чужой домашний кот)
public Cat(int weight, String color, String address) {
    this.color=color;
    this.weight=weight;
    this.address=address;
}
}
