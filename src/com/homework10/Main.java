package com.homework10;

public class Main {

    public static void main(String[] args) {
        Fruit greenApple = new Fruit(Fruit.Type.APPLE, Fruit.Color.GREEN, 346, 21.95);
        Fruit redApple = new Fruit(Fruit.Type.APPLE, Fruit.Color.RED, 230, 19.95);
        Fruit banana = new Fruit(Fruit.Type.BANANA, Fruit.Color.YELLOW, 220, 32.85);
        Fruit lemon = new Fruit(Fruit.Type.LEMON, Fruit.Color.YELLOW, 88, 34.95);

        double greenApplePrice = pricePerWeight(greenApple.getWeight(), greenApple.getPricePerKg());
        double redApplePrice = pricePerWeight(redApple.getWeight(), redApple.getPricePerKg());
        double bananaPrice = pricePerWeight(banana.getWeight(), banana.getPricePerKg());
        double lemonPrice = pricePerWeight(lemon.getWeight(), lemon.getPricePerKg());

        double checkAmount = greenApplePrice + redApplePrice + bananaPrice + lemonPrice;
        System.out.printf("Сумма по чеку: %.2f", checkAmount); // 7.59 грн

    }

    public static double pricePerWeight(int fruitWeight, double pricePerKg) {
        return pricePerKg * fruitWeight / 1000;
    }
}