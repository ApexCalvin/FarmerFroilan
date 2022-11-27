package Animal;

import Food.Egg;
import Interfaces.Eater;
import Interfaces.Edible;
import Interfaces.Produce;
import Interfaces.Vegetables;

public class Chicken extends Animal implements Produce, Eater<Vegetables> {
    public boolean fertilized = false;
    public Chicken(String name) {
        super(name);
    }

    public Chicken() {
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
        if (fertilized == true) {
            return new Egg();
        }
        return null;
    }

    @Override
    public String makeNoise() {
        super.makeNoise();
        return "bok bok";
    }

    @Override
    public void eat() {
        super.eat();
    }
}
