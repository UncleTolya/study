package main.jaxbstudy;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cat {
    public String name;
    private String address;
    private int age;
    private int high;


    public Cat() {
        this("noName");
    }

    public Cat(String name) {
        this.name = name;
        this.address = "homeless";
    }

    public Cat(String name, String address, int age, int high) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.high = high;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}
