package com.javarush.task.task07.task0724;

/* 
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...

Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human bez1=new Human ("Kate", true, 20);
        Human bez2=new Human ("Kate2", true, 21);
        Human bez3=new Human ("Kate3", true, 22);
        Human bez4=new Human ("Kate4", true, 24);
        Human with1=new Human ("Scate", true, 20, bez1, bez2);
        Human with2=new Human ("Scate2", true, 20, bez1, bez2);
        Human with3=new Human ("Scate3", true, 20, bez3, bez4);
        Human with4=new Human ("Scate4", true, 20, bez3, bez4);
        Human with5=new Human ("Scate5", true, 20, bez1, bez4);
        System.out.println(bez1);
        System.out.println(bez2);
        System.out.println(bez3);
        System.out.println(bez4);
        System.out.println(with1);
        System.out.println(with2);
        System.out.println(with3);
        System.out.println(with4);
        System.out.println(with5);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name=name;
            this.sex=sex;
            this.age=age;

        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;

        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}