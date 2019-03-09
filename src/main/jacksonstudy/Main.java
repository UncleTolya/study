package main.jacksonstudy;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        Cat cat = new Cat("Motya", 4);

        cat.fingerCount =19;

        StringWriter sw = new StringWriter();

        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(sw, cat);

        String result = sw.toString();

        System.out.println(result);


        String jsonString = "{\"name\":\"Oleg\",\"cats\":[{\"name\":\"Timka\"},{\"name\":\"Killer\"}]}";

        StringReader sr = new StringReader(jsonString);

        Cat cat2 = mapper.readValue(jsonString, HomeCat.class);

        System.out.println(cat2.getName());
        System.out.println(((HomeCat) cat2).getCats().get(1).getName());


    }
}
