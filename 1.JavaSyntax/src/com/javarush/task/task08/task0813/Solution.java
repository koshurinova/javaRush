package com.javarush.task.task08.task0813;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".


Требования:
1. Не изменяй заголовок метода createSet().
2. Программа не должна выводить текст на экран.
3. Программа не должна считывать значения с клавиатуры.
4. Метод createSet() должен создавать и возвращать множество (реализация HashSet).
5. Множество из метода createSet() должно содержать 20 слов на букву «Л».
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
//        String arr[] = { "Лист1","Лист2","Лист3","Лист4","Лист5","Лист6","Ли3ст7","Лист8","Лист9","Лист10",
//                "Лист11","Лис3т12","Лист13","Ли3ст14","Лист15","Лист316","Лист17","Лист18","Лист19","Лист20" };
        Set<String> set = new HashSet<>();
        for (int i = 0; i <20 ; i++) {
            set.add("Л"+i);
        }
        return set;
//        return new HashSet<>(Arrays.asList("Лист1","Лист2","Лист3","Лист4","Лист5","Лист6","Ли3ст7","Лист8","Лист9","Лист10",
//                "Лист11","Лис3т12","Лист13","Ли3ст14","Лист15","Лист316","Лист17","Лист18","Лист19","Лист20"));

    }

    public static void main(String[] args) {
//        System.out.println(createSet());

    }
}
