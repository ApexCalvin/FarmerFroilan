package Animal;

import Interfaces.Eater;
import Interfaces.Edible;
import Interfaces.Produce;
import Interfaces.Vegetables;

public class Chicken extends Animal implements Produce, Eater<Vegetables> {
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

    }

    @Override
    public Edible yield() {
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
