package Animal;

import Food.Basket;
import Interfaces.Eater;
import Interfaces.Edible;
import Interfaces.NoiseMaker;
import Interfaces.Vegetables;

public class Animal implements Eater<Vegetables>, NoiseMaker {

    public boolean fed = false;

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
    public String makeNoise() {

        return null;
    }

    public boolean isFed() {
        return fed;
    }

    @Override
    public void eat(Basket basket, int amount) {
        fed = true;
        for (int i = 0; i < amount; i++) {
            basket.remove(i);
        }
    }
}
