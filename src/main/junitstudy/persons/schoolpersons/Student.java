package main.junitstudy.persons.schoolpersons;

import main.junitstudy.persons.Person;
import main.junitstudy.persons.Sex;

public class Student extends Person implements SchoolAi {

    public Student(int age) {
        this("No Name", age, Sex.FEMALE);
    }

    public Student(String name, int age, Sex sex) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public Student() {
        this("No Name", 14, Sex.FEMALE);
    }

    @Override
    public void move() {
        System.out.println(this.getClass().getSimpleName() + " " + name + " running like a leopard");
    }

    @Override
    public void goToSchool() {
        System.out.println(this.getClass().getSimpleName() + " " + name + " is going to study");
    }

    @Override
    public void doSchoolStuff() {
        System.out.println(this.getClass().getSimpleName() + " " + name + " is getting lesson right now");
    }
}
