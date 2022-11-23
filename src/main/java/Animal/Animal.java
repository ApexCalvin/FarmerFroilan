package Animal;

import Interfaces.Eater;
import Interfaces.NoiseMaker;

public class Animal implements Eater, NoiseMaker {

    public String name;

    public Animal(String name) {
        this.name = name;
    }
    public Animal() {
        name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void eat() {

    }
}
