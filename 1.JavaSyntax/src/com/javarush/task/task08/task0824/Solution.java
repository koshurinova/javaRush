package com.javarush.task.task08.task0824;

/* 
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).

Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось:
два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> db1= new ArrayList<>();
        ArrayList<Human> db2= new ArrayList<>();
        ArrayList<Human> mp= new ArrayList<>();
        ArrayList<Human> ch= new ArrayList<>();
        Human ded1=new Human("ded1", true, 20, db1);
        Human ded2=new Human("ded2", true, 20, db2 );
        Human baba1=new Human("baba1", true, 20, db2 );
        Human baba2=new Human("baba2", true, 20, db1 );
        Human mum=new Human("mum", true, 20, mp );
        Human dad=new Human("dad", true, 20, mp );
        Human child1=new Human("child1", true, 20, ch );
        Human child2=new Human("child2", true, 20, ch );
        Human child3=new Human("child3", true, 20, ch );
        db1.add(mum);
        db2.add(dad);
        mp.add(child1);
        mp.add(child2);
        mp.add(child3);
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(baba1);
        System.out.println(baba2);
        System.out.println(mum);
        System.out.println(dad);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
     }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human (String name, boolean sex, int age, ArrayList<Human> children){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.children=children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
