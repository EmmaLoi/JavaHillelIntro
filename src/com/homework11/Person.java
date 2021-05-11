package com.homework11;

public class Person {

    private String name;
    private String surname;
    private int year;
    private double weight;
    private double height;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int year, double weight, double height) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.weight = weight;
        this.height = height;
    }
}
