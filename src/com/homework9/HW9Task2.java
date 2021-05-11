package com.homework9;

public class HW9Task2 {
    public static void main(String[] args) {
        System.out.println(valuesWithSubstitution());
    }

    public static String valuesWithSubstitution() {
        String result = "";
        for (int i = 1; i <= 99; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result += "HelloWorld ";
            } else if (i % 3 == 0) {
                result += "Hello ";
            } else if (i % 5 == 0) {
                result += "World ";
            } else {
                result += i + " ";
            }
        }
        return result;
    }
}