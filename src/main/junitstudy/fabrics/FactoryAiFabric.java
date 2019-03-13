package main.junitstudy.fabrics;

import main.junitstudy.persons.Person;
import main.junitstudy.persons.workers.Trainee;
import main.junitstudy.persons.workers.Worker;

public class FactoryAiFabric extends PersonFabric {

    @Override
    public Person makePerson(int age) {
        if (age < 0 || age > 200) throw new IllegalArgumentException();
        if (age <= 30) return new Trainee(age);
        return new Worker(age);
    }

}
