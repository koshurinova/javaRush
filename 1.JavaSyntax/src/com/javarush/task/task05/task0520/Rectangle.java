package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов конструкторов.

Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)


Требования:
1. У класса Rectangle должны быть переменные top, left, width и height с типом int.
2. У класса должен быть хотя бы один конструктор.
3. У класса должно быть хотя бы два конструктора.
4. У класса должно быть хотя бы три конструктора.
5. У класса должно быть хотя бы четыре конструктора.
*/


public class Rectangle {
    //напишите тут ваш код
    int left, top, width, height;

    public static void main(String[] args) {

    }
    public Rectangle (int left, int top, int width, int height){
        this.height=height;
        this.left=left;
        this.top=top;
        this.width=width;
    }
    public Rectangle (int left, int top, int width){
        this.left=left;
        this.top=top;
        this.width=width;
    }
    public Rectangle (int width, int height){
        this.height=height;
        this.width=width;
    }
    public Rectangle (int width){
        this.width=width;
    }
}
