package jacksonstudy.main;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.ArrayList;

@JsonAutoDetect
public class HomeCat extends Cat{

    private String homeCatName;

    @JsonDeserialize(as=ArrayList.class,contentAs=Cat.class)
    private ArrayList<Cat> cats;

    public HomeCat() {

    }

    public HomeCat(String name) {

    }

    @Override
    public String getName() {
        return homeCatName;
    }

    @Override
    public void setName(String name) {
        homeCatName = name;
    }

    public ArrayList<Cat> getCats() {
        return cats;
    }

    public void setCats(ArrayList<Cat> cats) {
        this.cats = cats;
    }
}
