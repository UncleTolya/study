package main.serializationstudy;

import java.io.*;
import java.math.BigDecimal;

public class Main {
    private static final String fileHusband = "/Users/mhlv/Documents/husband";
    private static final String fileWife = "/Users/mhlv/Documents/wife";

    public static void main(String[] args) throws IOException, ClassNotFoundException{

        Man husband = new Man("Igor");
        husband.setZarplata(new BigDecimal("500000"));
        System.out.println();

        Woman wife = new Woman("Sveta", 4);
        System.out.println();

        husband.setCouple(wife);
        wife.setCouple(husband);

        save(husband, fileHusband);
        System.out.println();

        Man husband2 = (Man) load(fileHusband);
        System.out.println(husband.getName());
        System.out.println(husband2.getName());
        System.out.println(husband.equals(husband2));
        System.out.println();

        save(wife, fileWife);
        Woman wife2 = (Woman) load(fileWife);
        System.out.println(wife.getName());
        System.out.println(wife2.getName());
        System.out.println(wife.equals(wife2));

    }

    public static <E extends Object> void  save(E obj, String fileName) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutput oo = new ObjectOutputStream(fos);
        oo.writeObject(obj);
        oo.flush();
        oo.close();
        System.out.println("Object " + obj.toString() + " was been save to file " + fileName);
    }

    public static Object load(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInput ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        ois.close();
        return obj;
    }
}
