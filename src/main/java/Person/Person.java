package Person;

import Interfaces.*;

public class Person implements Eater<Edible>, NoiseMaker, Rider<Rideable> {
    public String name;
    public Boolean mounted = false;

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
    public void eat() { }

    @Override
    public String makeNoise() { return "Groan"; }

    public void mount(Rideable ride) {
        ride.setRidden(this);
        mounted = true;
//        return true;
    }

    @Override
    public void dismount() {
        mounted = false;
    }

    @Override
    public boolean isMounted() {
        return mounted; }
}
