package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.

Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Объяви переменную типа список строк и сразу проинициализируй ee.
3. Добавь в список слова: «мама», «мыла», «раму».
4. После каждого слова добавь в список строку, содержащую слово «именно».
5. Выведи элементы списка на экран, каждый с новой строки.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String[] str = {"мама", "мыла", "раму"};
        String stroka="именно";
        ArrayList<String> list=new ArrayList<>();
        list.addAll(Arrays.asList(str));
        list.add(1,stroka);
        list.add(3,stroka);
        list.add(5,stroka);
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
