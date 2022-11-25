package Animal;

import Interfaces.Eater;
import Interfaces.Edible;
import Interfaces.Produce;
import Interfaces.Vegetables;

public class Chicken extends Animal implements Produce, Eater<Vegetables> {
    @Override
    public boolean isEdible() {
        return false;
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
