package com.javarush.task.task08.task0830;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        int[] array = {1, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }}

