package main.junitstudy.fabrics;

import main.junitstudy.persons.Person;

public abstract class PersonFabric {
    public abstract Person makePerson(int age);

    public Person makePerson() {

        int randomAge = (int)(Math.random() * 100);
        return makePerson(randomAge);
    }
}
