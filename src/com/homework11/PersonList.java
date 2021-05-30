package com.homework11;

import java.util.*;

public class PersonList {
    private final Random RANDOM = new Random();
    private final List<Person> persons = new ArrayList<>();

    private final String[] PERSON_NAME = {"Petr", "Pavel", "Ivan", "Ella", "Mary", "Lili"};
    private final String[] PERSON_SURNAME = {"Smith", "Wilson", "Taylor", "Anderson", "Cooper", "Miller"};

    public List<Person> getPersons() {
        return persons;
    }

    public void addPersons() {
        for (int i = 1; i <= 100; i++) {
            persons.add(createRandomPerson());
        }
    }

    public List<Person> getUniquePerson() {
        Set<Person> personSet = new HashSet<>(persons);
        return new ArrayList<>(personSet);
    }

    private Person createRandomPerson() {
        String randomName = PERSON_NAME[RANDOM.nextInt(PERSON_NAME.length)];
        String randomSurname = PERSON_SURNAME[RANDOM.nextInt(PERSON_SURNAME.length)];
        final int MAX_AGE = 101;
        int randomYear = RANDOM.nextInt(MAX_AGE);
        int randomWeightKg = getWeight(randomYear);
        int randomHeightCm = getHeight(randomYear);

        return new Person(randomName, randomSurname, randomYear, randomWeightKg, randomHeightCm);
    }

    private int getWeight(int year) {
        if (year <= 1) {
            return RANDOM.nextInt(7) + 2;
        } else if (year == 2) {
            return RANDOM.nextInt(5) + 9;
        } else if (year <= 5) {
            return RANDOM.nextInt(16) + 14;
        } else if (year <= 10) {
            return RANDOM.nextInt(15) + 30;
        } else if (year <= 15) {
            return RANDOM.nextInt(15) + 45;
        } else if (year <= 100) {
            return RANDOM.nextInt(60) + 60;
        }
        return 0;
    }

    private int getHeight(int year) {
        if (year == 0) {
            return RANDOM.nextInt(20) + 40;
        } else if (year <= 3) {
            return RANDOM.nextInt(40) + 60;
        } else if (year <= 6) {
            return RANDOM.nextInt(30) + 100;
        } else if (year <= 14) {
            return RANDOM.nextInt(30) + 130;
        } else if (year <= 100) {
            return RANDOM.nextInt(60) + 160;
        }
        return 0;
    }
}