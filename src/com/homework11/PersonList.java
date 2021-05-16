package com.homework11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonList {
    Random random = new Random();

    String[] personName = {"Petr", "Pavel", "Ivan", "Ella", "Mary", "Lili"};
    String[] personSurname = {"Smith", "Wilson", "Taylor", "Anderson", "Cooper", "Miller"};

    public Person createRandomPerson() {
        String randomName = personName[random.nextInt(personName.length)];
        String randomSurname = personSurname[random.nextInt(personSurname.length)];
        int randomYear = random.nextInt(101);
        int randomWeightKg = getWeight(randomYear);
        int randomHeightCm = getHeight(randomYear);

        return new Person(randomName, randomSurname, randomYear, randomWeightKg, randomHeightCm);
    }

    private List<Person> persons = new ArrayList<>();

    public List<Person> getPersons() {
        return persons;
    }

    public void addPersonInList() {
        for (int i = 1; i <= 100; i++) {
            persons.add(createRandomPerson());
        }
    }

    public int getWeight(int year) {
        if (year <= 1) {
            return random.nextInt(7) + 2;
        } else if (year == 2) {
            return random.nextInt(5) + 9;
        } else if (year <= 5) {
            return random.nextInt(16) + 14;
        } else if (year <= 10) {
            return random.nextInt(15) + 30;
        } else if (year <= 15) {
            return random.nextInt(15) + 45;
        } else if (year <= 100) {
            return random.nextInt(60) + 60;
        }
        return 0;
    }

    public int getHeight(int year) {
        if (year == 0) {
            return random.nextInt(20) + 40;
        } else if (year <= 3) {
            return random.nextInt(40) + 60;
        } else if (year <= 6) {
            return random.nextInt(30) + 100;
        } else if (year <= 14) {
            return random.nextInt(30) + 130;
        } else if (year <= 100) {
            return random.nextInt(60) + 160;
        }
        return 0;
    }
}