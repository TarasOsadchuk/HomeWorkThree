package com.geekbrains;

import java.util.Arrays;

public class HomeWorkThree {
    public static void main(String[] args) {
        taskOne(); // task 1
        taskTwo(); // task 2
        taskThree(); // task 3
        taskFour(); // task 4
        taskFive(3, 6); // task 5
        taskSix(); // task 6^
        taskSeven(new int[]{2, 4, 5, 6, 7}); // task 7^^
        taskEight(); // task 8^^^
    }

    public static void taskOne() {
        int[] arrOne = {0, 1, 1, 0, 1, 0, 0, 0, 1, 1};
        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i] == 0) {
                arrOne[i] = 1;
            } else {
                arrOne[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arrOne));
    } // task 1

    public static void taskTwo() {
        int[] arrTwo = new int[100];
        int num = 1;
        for (int i = 0; i < arrTwo.length; i++) {
            arrTwo[i] = num;
            num++;
        }
        System.out.println(Arrays.toString(arrTwo));
    } // task 2

    public static void taskThree() {
        int[] arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrThree.length; i++) {
            if (arrThree[i] < 6) {
                arrThree[i] = arrThree[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arrThree));
    } // task 3

    public static void taskFour() {
        int[][] arrFour = new int[5][5];
        for (int i = 0; i < arrFour.length; i++) {
            for (int j = 0; j < arrFour.length; j++) {
                arrFour[i][i] = 1;
                System.out.print(arrFour[i][j] + " ");
            }
            System.out.println();
        }
    } // task 4

    public static void taskFive(int len, int initialValue) {
        int[] arrFive = new int[len];
        Arrays.fill(arrFive, initialValue);
        /*
        Сначала написал:

        for (int i = 0; i < arrFive.length; i++) {
            arrays[i] = initialValue;
        }

        Затем нажал сделал через Arrays.fill();
        За него читал в JavaRush.
        */
        System.out.println(Arrays.toString(arrFive));
    } // task 5

    public static void taskSix() {
        int[] arrSix = {2, 0, -2, 5, 4};
        int min = arrSix[0];
        int max = arrSix[0];
        for (int i : arrSix) {
            if (i < min) {
                min = i;
            }
        }
        for (int i : arrSix) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(min);
        System.out.println(max);
        /*
        Или можно:
        for (int i = 0; i < arrSix.length; i++) {
            if (arrSix[i] < min) {
                min = arrSix[i];
            }
        }
        Или:
        Arrays.sort(arrSix);
        System.out.println(arrSix[0]);
        Я так бы написал если бы дальше я не буду использовать этот массив,
        или без разницы в каком он порядке.
        */
    } // task 6^

    public static void taskSeven(int[] arrSeven) {
        boolean result = false;
        int sum = 0;
        for (int j : arrSeven) {
            sum = sum + j;
        }
        int left = 0;
        int right = sum;
        for (int i : arrSeven) {
            left = left + i;
            right = right - i;
            if (left == right) {
                result = true;
            }
        }
        System.out.println(result);
    } // task 7^^

    public static void taskEight() {
        /*
        Виталий
        Не смог сделать задачу, прочитал методичку и информацию на JavaRush.
        Ломал голову больше двух дней, сдал, потому что срок уже был 4 дня,
        надеюсь на каком-то из уроков мы разберем ету задачу.
        Не хотел списывать)
                                                                (Osadchuk T.)
         */
    } // task 8^^^
}