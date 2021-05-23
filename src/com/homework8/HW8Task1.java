package com.homework8;

//Электронные часы показывают время в формате от 00:00 до 23:59.
//Подсчитать сколько раз за сутки случается так, что слева от двоеточия
//показывается симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).

public class HW8Task1 {
    public static void main(String[] args) {
        int numberCoincidences = 0;

        for (int hours = 0; hours < 24; hours++) {
            for (int minutes = 0; minutes <= 59; minutes++) {
                int h1 = hours / 10;
                int h2 = hours % 10;
                int m1 = minutes / 10;
                int m2 = minutes % 10;
                if (h1 == m2 && h2 == m1) {
                    numberCoincidences++;
                }
            }
        }
        System.out.println(numberCoincidences);
    }
}