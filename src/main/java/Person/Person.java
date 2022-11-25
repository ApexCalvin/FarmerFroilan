package Person;

import Interfaces.Eater;
import Interfaces.NoiseMaker;
import Interfaces.Vegetables;

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
    public String makeNoise() {

        return "Groan";


}
