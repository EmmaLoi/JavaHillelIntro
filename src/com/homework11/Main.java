package com.homework11;

public class Main {
    public static void main(String[] args) {
        PersonList personList = new PersonList();
        personList.addPersonInList();

        for (Person person : personList.getPersons()) {
            System.out.println(person.toString());
        }
    }
}