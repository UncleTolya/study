package main.junitstudy;

import main.junitstudy.fabrics.FactoryAiFabric;
import main.junitstudy.fabrics.SchoolAiFabric;
import main.junitstudy.persons.Person;

import java.util.ArrayList;

public class SchoolLife {
    public static void main(String[] args) {
        ArrayList<Person> ais = new ArrayList<>();
        SchoolAiFabric schoolAiFabric = new SchoolAiFabric();
        FactoryAiFabric factoryAiFabric = new FactoryAiFabric();
        for (int i = 0; i < 15; i++) {
            ais.add(schoolAiFabric.makePerson());
        }
        for (int i = 0; i < 15; i++) {
            ais.add(factoryAiFabric.makePerson());
        }

        for (Person ai : ais) {
            System.out.println(ai);
        }

    }
}
