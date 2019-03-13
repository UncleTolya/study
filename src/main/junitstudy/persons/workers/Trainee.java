package main.junitstudy.persons.workers;

import main.junitstudy.persons.Person;
import main.junitstudy.persons.Sex;

public class Trainee extends Person implements FactoryAi {

    public Trainee(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Trainee(int age) {
        this("No Name", age, Sex.FEMALE);
    }

    public Trainee() {
        this("No Name", 25, Sex.FEMALE);
    }

    @Override
    public void move() {
        System.out.println(this.getClass().getSimpleName() + name + " read a some book and see at worker");
    }

    @Override
    public void beingSevere() {
        System.out.println(this.getClass().getSimpleName() + name + " is sever");
    }
}
