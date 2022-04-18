package com.company;

import PersonService.PersonSV;

import java.util.ArrayList;

public class TestSytsem {
    public static void main(String[] args) {

        PersonSV service = new PersonSV();
        ArrayList<Person> list = service.getAllPeople();
        service.show(list);

        Person newPerson = service.createPerson();
        service.addPerson
    }



}
