package main.serializationstudy;

import java.io.Serializable;
import java.util.Objects;

public abstract class Person implements Serializable {
    protected String name;
    protected Person couple;

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected Person getCouple() {
        return couple;
    }

    protected void setCouple(Person couple) {
        this.couple = couple;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
