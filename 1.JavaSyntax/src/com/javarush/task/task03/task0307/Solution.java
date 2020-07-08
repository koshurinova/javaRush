package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
Создать 5 зергов, 3 протосса и 4 террана.
Дать им всем уникальные имена.


Требования:
1. Нельзя изменять классы Zerg, Protoss и Terran.
2. Нужно создать 5 объектов типа Zerg и каждому из них дать свое имя.
3. Нужно создать 3 объекта типа Protoss и каждому из них дать свое имя.
4. Нужно создать 4 объекта типа Terran и каждому из них дать свое имя.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg[] zerg = new Zerg[5];
        Protoss[] protoss = new Protoss[3];
        Terran[] terran = new Terran[4];
        for(int i = 0; i <=4; i++){
            zerg[i] = new Zerg();
            zerg[i].name="Zerg"+i;
        }
        for(int i = 0; i <=2; i++){
            protoss[i] = new Protoss();
            protoss[i].name="Protoss"+i;
        }
        for(int i = 0; i <=3; i++){
            terran[i] = new Terran();
            terran[i].name="Terran"+i;
        }


    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
