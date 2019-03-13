package main.junitstudy.persons;



public abstract class Person {
    protected String name;
    protected int age;
    protected Sex sex;

    public abstract void move();

    public void goSleep() {
        System.out.println(this.getClass().getSimpleName() + " who's name is " + name + "gone to bed");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" + "name='" + name + '\'' + ", age=" + age + ", sex=" + sex + '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }
}
