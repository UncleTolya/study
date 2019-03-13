package main.junitstudy.fabrics;

import main.junitstudy.persons.*;
import main.junitstudy.persons.schoolpersons.Director;
import main.junitstudy.persons.schoolpersons.Student;
import main.junitstudy.persons.schoolpersons.Teacher;

public class SchoolAiFabric extends PersonFabric {

    @Override
    public Person makePerson(int age) {
        if (age < 0 || age > 200) throw new IllegalArgumentException();
        if (age <= 18) return new Student(age);
        if (age > 18 && age < 50) return new Teacher(age);
        return new Director(age);
    }
}
