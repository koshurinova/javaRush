package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Нужно сделать так, чтобы программа вводила с клавиатуры пары (число и строку) и сохраняла их в HashMap.

Ключевые требования:
Пустая строка - конец ввода данных.
Числа могут повторяться.
Строки всегда уникальны.
Введенные данные не должны потеряться!
Затем программа должна выводить содержание HashMap на экран.
Каждую пару - с новой строки.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мыла
2 Рама
1 Мама


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить текст на экран.
3. В методе main объяви переменную коллекции HashMap и сразу проинициализируй ee.
4. Программа должна помещать в HashMap пары считанные с клавиатуры.
5. Программа должна выводить на экран содержимое HashMap согласно условию.
Ключ и значение разделены пробелом. Каждое значение с новой строки.
*/

public class Solution {
    static String index;
    static String name;
    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<String, String>();
 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try{
            String id = reader.readLine();
                if (id==null || id.isEmpty()  ) {
                    break;
                }
            String name = reader.readLine();
            map.put(name,id);
                if (name == null || name.isEmpty()  ) {
                    break;
                }

            }
            catch (Exception e) {
                break;
            }

        }
        map.remove(null, null);
        for (Map.Entry<String, String> pair : map.entrySet()) {
            index = pair.getValue();
            name = pair.getKey();
            System.out.println(index + " " + name);
        }

//        System.out.println("Id=" + id + " Name=" + name);
    }
}
