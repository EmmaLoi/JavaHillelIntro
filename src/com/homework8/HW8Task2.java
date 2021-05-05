package com.homework8;

//Найти количество счастливых билетиков на трамвай от 000001 до 999999
//(те у которых сумма первых 3 цифр равна сумме последних 3)

public class HW8Task2 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i <= 999; i++) {
            for (int j = 1; j <= 999; j++) {
                if (i / 100 + i / 10 % 10 + i % 10 == j / 100 + j / 10 % 10 + j % 10) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}