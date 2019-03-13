package main.serializationstudy;

import java.math.BigDecimal;

public class Man extends Person {
//    private String name;
    private BigDecimal zarplata;

    public Man() {
        this.name= "Name not set";
    }

    public Man(String name) {
        System.out.println("Man " + name + " has been made");
        this.name = name;
    }

    public Man(String name, BigDecimal zarplata) {
        this(name);
        this.zarplata = zarplata;
    }

    public void setZarplata(BigDecimal zarplata) {
        this.zarplata = zarplata;
    }

    public BigDecimal getZarplata() {
        return zarplata;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
