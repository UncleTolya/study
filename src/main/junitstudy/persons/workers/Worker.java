package main.junitstudy.persons.workers;

import main.junitstudy.persons.Person;
import main.junitstudy.persons.Sex;

public class Worker extends Person implements FactoryAi {

    public Worker(String name, int age, Sex sex) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public Worker(int age) {
        this("No Name", age, Sex.MALE);
    }

    public Worker() {
        this("No Name", 40, Sex.MALE);
    }

    @Override
    public void move() {
        System.out.println(this.getClass().getSimpleName() + name + " bit hammer");

    }

    @Override
    public void beingSevere() {
        System.out.println(this.getClass().getSimpleName() + name + " is sever");
    }

    public void workHard() {
        System.out.println(this.getClass().getSimpleName() + name + " is working like a demon");
    }
}
