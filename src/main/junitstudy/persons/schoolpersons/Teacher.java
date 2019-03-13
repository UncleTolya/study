package main.junitstudy.persons.schoolpersons;

import main.junitstudy.persons.Person;
import main.junitstudy.persons.Sex;

public class Teacher extends Person implements SchoolAi {

    public Teacher(int age) {
        this("No Name", age, Sex. MALE);
    }

    public Teacher(String name, int age, Sex sex) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public Teacher() {
        this("No Name",35, Sex.MALE);
    }

    @Override
    public void move() {
        System.out.println(this.getClass().getSimpleName() + " " + name + " just moving");
    }

    @Override
    public void goToSchool() {
        System.out.println(this.getClass().getSimpleName() + " " + name + " is going to work");
    }

    @Override
    public void doSchoolStuff() {
        System.out.println(this.getClass().getSimpleName() + " " + name + " is teaching right now");
    }
}
