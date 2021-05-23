package com.homework11;

public class Person {
    private final String NAME;
    private final String SURNAME;
    private int year;
    private int weightKg;
    private int heightCm;

    public Person(String name, String surname) {
        this.NAME = name;
        this.SURNAME = surname;
    }

    public Person(String name, String surname, int year, int weight, int height) {
        this.NAME = name;
        this.SURNAME = surname;
        this.year = year;
        this.weightKg = weight;
        this.heightCm = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + NAME + '\'' +
                ", surname='" + SURNAME + '\'' +
                ", year=" + year +
                ", weightKg=" + weightKg +
                ", heightCm=" + heightCm +
                '}';
    }
}