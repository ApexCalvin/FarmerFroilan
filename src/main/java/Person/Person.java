package Person;

import Interfaces.Eater;
import Interfaces.NoiseMaker;

public class Person implements Eater, NoiseMaker {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        name = "";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void eat() {

    }

    @Override
    public void makeNoise() {

    }

}
