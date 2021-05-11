package com.homework9;

import java.util.Random;

//В банк положили S денег. Какой станет сумма вклада через N лет,
// если процент 1,5% добавляется к сумме вклада ежемесячно.

public class HW9Task1 {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        float initialDepositAmount = RANDOM.nextInt(5000);
        int years = RANDOM.nextInt(4) + 1;
        int month = years * 12;

        System.out.println("Первоначальный вклад: " + initialDepositAmount);
        float totalDepositAmount = depositAmountWithPercent(initialDepositAmount, month);
        System.out.println("Сумма вклада через " + years + " лет равна: " + totalDepositAmount);
    }

    private static long percentInMonth(float deposit) {
        return (Math.round((float) (deposit * 0.015)));
    }

    private static float depositAmountWithPercent(float initialDepositAmount, int month) {
        for (int i = 1; i <= month; i++) {
            initialDepositAmount += percentInMonth(initialDepositAmount);
        }
        return initialDepositAmount;
    }
}