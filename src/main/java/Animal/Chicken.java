package Animal;

import Food.Basket;
import Food.Egg;
import Interfaces.Eater;
import Interfaces.Edible;
import Interfaces.Produce;
import Interfaces.Vegetables;

public class Chicken extends Animal implements Produce, Eater<Vegetables> {
    public boolean fertilized = false;
    public Chicken(String name) {
        this.name = name;
    }

    public Chicken() {
        name = "";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean isEdible() {
        return false;
    } //isFertilized() ?

    @Override
    public void fertilized() {
        fertilized = true;
    }
    public boolean getFertilized() {
        return fertilized;
    }

    @Override
    public Edible yield() {
        Egg egg = new Egg();
        if (fertilized == true) {
            egg.fertilized();
            return egg;
        } else {
            return egg;
        }
    }

    @Override
    public String makeNoise() {
        super.makeNoise();
        return "bok bok";
    }

    public void eat(Basket basket, Edible edible) {}
}
