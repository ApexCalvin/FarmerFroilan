package Person;

import Food.Basket;
import Interfaces.*;

public class Person implements Eater<Edible>, NoiseMaker, Rider<Rideable> {
    public String name;

    public boolean fed = false;

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
    public void eat(Basket basket, int amount) {
        fed = true;
        for (int i = 0; i < amount; i++) {
            basket.remove(i);
        }
    }

    public boolean isFed() {
        return fed;
    }

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
        return mounted;
    }
}
