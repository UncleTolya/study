package main.jaxbstudy;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class Main {

    public static void main(String[] args) throws JAXBException {

        //Some logic to test
        Cat cat = new Cat("ushastik");

        StringWriter sw = new StringWriter();

        JAXBContext context = JAXBContext.newInstance(Cat.class);

        Marshaller marshaller = context.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(cat, sw);

        String result = sw.toString();
        System.out.println(result);

    }

}
