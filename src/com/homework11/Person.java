package com.homework11;

public class Person {
    private String name;
    private String surname;
    private int year;
    private int weightKg;
    private int heightCm;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int year, int weight, int height) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.weightKg = weight;
        this.heightCm = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", weightKg=" + weightKg +
                ", heightCm=" + heightCm +
                '}';
    }
}