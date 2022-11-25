package Person;

import Interfaces.*;

public class Person implements Eater<Edible>, NoiseMaker, Rider<Rideable> {
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

    @Override
    public boolean mount(Rideable ride) {

        return (Boolean) null;
    }

    @Override
    public boolean dismount(Rideable ride) {
        return (Boolean) null;
    }
}
