package com.homework11;

public class Main {
    public static void main(String[] args) {
        PersonList personList = new PersonList();
        personList.addPersons();

        for (Person person : personList.getPersons()) {
            System.out.println(person.toString());
        }

        System.out.println("Person list with unique name and surname:");
        System.out.println(personList.getUniquePerson());
    }
}