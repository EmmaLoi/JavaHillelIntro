package com.homework11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonList {

    Random randomYear = new Random(100);
//  Random weightAndHeight = new Random();
    String[] personName = {"Мария", "Кузьма", "Валентин", "Мурка", "Алексей", "Пегас"};
    String[] personSurname = {"Кузьменко", "Иванов", "Река", "Петров", "Гречкин", "Крупичкин"};

    private List<Person> persons = new ArrayList<>();

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void randomPersonList(String name, String surname, int year, double weight, double height){

        for (Person person : persons) {
            persons.add()

        }

    }
}
