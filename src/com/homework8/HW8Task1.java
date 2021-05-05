package com.homework8;

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