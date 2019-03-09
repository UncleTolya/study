package main.serializationstudy;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Woman extends Person  implements  Runnable{
    private transient Thread saw;
    public int boobsSize;

    public Woman() {
        this.name= "Name not set";
        saw = new Thread(this);
        saw.start();
    }

    public Woman(String name) {
        System.out.println("Woman " + name + " has been made");
        this.name = name;
    }

    public Woman(String name, int boobsSize) {
        this(name);
        this.boobsSize = boobsSize;
        saw = new Thread(this);
        saw.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println( "You broke my life!");
        }

    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        beginFuckTheBrain();
    }

    private void setBoobsSize(int boobsSize) {
        this.boobsSize = boobsSize;
    }

     void beginFuckTheBrain() {
        Thread t = new Thread(this);
        t.start();
    }
}
