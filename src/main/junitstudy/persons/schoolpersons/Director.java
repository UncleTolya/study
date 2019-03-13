package main.junitstudy.persons.schoolpersons;

import main.junitstudy.persons.Person;
import main.junitstudy.persons.Sex;

public class Director extends Person implements SchoolAi {

    public Director(String name, int age, Sex sex) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public Director(int age) {
        this("No Name", age, Sex.MALE);
    }

    public Director() {
        this("No Name", 50, Sex.MALE);
    }

    @Override
    public void move() {
        System.out.println(this.getClass().getSimpleName() + " " + name + " moving slowly");
    }

    @Override
    public void goToSchool() {
        System.out.println(this.getClass().getSimpleName() + " " + name + " is going to school to being a boss");
    }

    @Override
    public void doSchoolStuff() {
        System.out.println(this.getClass().getSimpleName() + " " + name + " think how to get more money");
    }
}
