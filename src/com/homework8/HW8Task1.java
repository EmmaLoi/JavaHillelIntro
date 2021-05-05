package com.homework8;

//Электронные часы показывают время в формате от 00:00 до 23:59.
//Подсчитать сколько раз за сутки случается так, что слева от двоеточия
//показывается симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).

public class HW8Task1 {
    public static void main(String[] args) {
        int numberCoincidences = 0;

        for (int h = 0; h <= 24; h++) {
            for (int m = 0; m <= 59; m++) {
                if (h == m) {
                    numberCoincidences++;
                }
            }
        }
        System.out.println(numberCoincidences);
    }
}